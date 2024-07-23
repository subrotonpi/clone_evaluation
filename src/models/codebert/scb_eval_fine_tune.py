#!/usr/bin/env python
# coding: utf-8

# In[16]:


from model_simple import Model
from transformers import (RobertaConfig, RobertaModel, RobertaTokenizer)
from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score, confusion_matrix
import seaborn as sns
import numpy as np
from numpy import argmax, save, load, sum, sqrt
from numpy.linalg import norm
import os, re, torch, json
from collections import Counter
import pandas as pd
# from tqdm.notebook import tqdm
from tqdm import tqdm
device = 'cuda' if torch.cuda.is_available else 'cpu'
print('Using device: ', device)

import pandas as pd
import random

def set_seed(seed=42):
    random.seed(seed)
    os.environ['PYHTONHASHSEED'] = str(seed)
    np.random.seed(seed)
    torch.manual_seed(seed)
    torch.cuda.manual_seed(seed)
    torch.backends.cudnn.deterministic = True
# In[17]:


config = RobertaConfig.from_pretrained('microsoft/codebert-base')
model = RobertaModel.from_pretrained('microsoft/codebert-base')
tokenizer = RobertaTokenizer.from_pretrained('microsoft/codebert-base')
model = Model(model,config,tokenizer)
# pytorch_total_params = sum(p.numel() for p in model.parameters() if p.requires_grad)
# print(pytorch_total_params)
# quit()

# model_path = 'saved_models/checkpoint-best-f1-bcb/model.bin'
# model.load_state_dict(torch.load(model_path, map_location=lambda storage, loc: storage), strict=False)
model.to(device)

BLOCK_SIZE=512
batch_size = 16
set_seed(seed=42)


# In[18]:


def convert_examples_to_features_with_label(code_1, code_2, label=None):     
    code1_tokens=tokenizer.tokenize(code_1)    
    code1_tokens=code1_tokens[:BLOCK_SIZE-2]
    code1_tokens =[tokenizer.cls_token]+code1_tokens+[tokenizer.sep_token]
    code1_ids=tokenizer.convert_tokens_to_ids(code1_tokens)
    padding_length = BLOCK_SIZE - len(code1_ids)
    code1_ids+=[tokenizer.pad_token_id]*padding_length
    
    code2_tokens=tokenizer.tokenize(code_2)
    code2_tokens=code2_tokens[:BLOCK_SIZE-2]
    code2_tokens =[tokenizer.cls_token]+code2_tokens+[tokenizer.sep_token]      
    code2_ids=tokenizer.convert_tokens_to_ids(code2_tokens)
    padding_length = BLOCK_SIZE - len(code2_ids)
    code2_ids+=[tokenizer.pad_token_id]*padding_length
    #source_tokens=code1_tokens+code2_tokens
    source_ids=code1_ids+code2_ids
    if label is not None:
        return source_ids, label
    else:
        return source_ids


# In[19]:
data_path = "/student/egk204/projects/clone-type-iv/data"
#/student/egk204/projects/clone-type-iv/data
benchmark = "bcb"
train = pd.read_csv(f"{data_path}/{benchmark}/train.csv", names=['id1', 'id2', 'label'])
valid = pd.read_csv(f"{data_path}/{benchmark}/valid.csv", names=['id1', 'id2', 'label'])
test = pd.read_csv(f"{data_path}/{benchmark}/test.csv", names=['id1', 'id2', 'label'])
codes={}
codes_jsonl = f"{data_path}/{benchmark}/data.jsonl"
with open(codes_jsonl) as f:
    for line in f:
        line=line.strip()
        js=json.loads(line)
        codes[js['idx']]=js['func']
# In[20]:

print("check point 1")

y_preds=[]
y_trues=[]

for ind, pair in test.iterrows():
    code_1, code_2, label = codes[pair.id1], codes[pair.id2], pair.label 
    example = convert_examples_to_features_with_label(code_1, code_2, label)#convert_examples_to_features(code_1, code_2)
    source_ids = torch.tensor(example[0]).to(device)
    prediction = model(source_ids)
    prediction = int(torch.argmax(prediction[0]))
    y_preds.append(prediction)
    y_trues.append(example[1])
    
    
def evaluate(y_trues, y_preds):
    accuracy= accuracy_score(y_trues, y_preds)
    f1 = f1_score(y_trues, y_preds)
    precision = precision_score(y_trues, y_preds)
    recall = recall_score(y_trues, y_preds)
    #print('precision: {0}, recall: {1}, f1: {2}, accuracy: {2}'.format(precision, recall, f1, accuracy))
    return precision, recall, f1, accuracy

precision, recall, f1, accuracy = evaluate(y_trues, y_preds)
print('precision: {0}, recall: {1}, f1: {2}, accuracy: {2}'.format(precision, recall, f1, accuracy))


# # Fine tuned on SCB

# In[21]:


from torch.utils.data import DataLoader, Dataset, SequentialSampler, RandomSampler
from transformers import WEIGHTS_NAME, get_linear_schedule_with_warmup
from torch.optim import AdamW 
#-------------
class InputFeatures(object):
    """A single training/test features for a example."""
    def __init__(self,
                 input_ids,
                 label

    ):
        self.input_ids = input_ids
        self.label=label
#------------- 
class CloneDataset(Dataset):
    def __init__(self, pair_info):
        self.examples = []
        for i, pair in pair_info.iterrows():
            code_1, code_2, label = codes[pair.id1], codes[pair.id2], pair.label
            example = convert_examples_to_features_with_label(code_1, code_2, label)
            self.examples.append(InputFeatures(example[0], example[1]))

    def __len__(self):
        return len(self.examples)

    def __getitem__(self, item):        
        return torch.tensor(self.examples[item].input_ids),torch.tensor(self.examples[item].label)
    
    

        
train_dataset = CloneDataset(train)
train_sampler = RandomSampler(train_dataset) 
train_dataloader = DataLoader(train_dataset, sampler=train_sampler, batch_size=batch_size)
'''
val_dataset = CloneDataset(valid)
val_sampler = RandomSampler(val_dataset) 
val_dataloader = DataLoader(val_dataset, sampler=val_sampler, batch_size=4)

test_dataset = CloneDataset(test)
test_sampler = RandomSampler(test_dataset) 
test_dataloader = DataLoader(test_dataset, sampler=test_sampler, batch_size=4)'''


# In[22]:
print("check point 2")

epochs = 2
max_steps=epochs*len( train_dataloader)
save_steps=len( train_dataloader)//10
warmup_steps=max_steps//5

gradient_accumulation_steps = 1
max_grad_norm=1

no_decay = ['bias', 'LayerNorm.weight']
optimizer_grouped_parameters = [
    {'params': [p for n, p in model.named_parameters() if not any(nd in n for nd in no_decay)],'weight_decay': 0.0},
    {'params': [p for n, p in model.named_parameters() if any(nd in n for nd in no_decay)], 'weight_decay': 0.0}
]

optimizer = AdamW (optimizer_grouped_parameters, lr=2e-5, eps=1e-8)
scheduler = get_linear_schedule_with_warmup(optimizer, num_warmup_steps=warmup_steps, num_training_steps=max_steps)

global_step=0
tr_loss, logging_loss,avg_loss,tr_nb,tr_num,train_loss = 0.0, 0.0,0.0,0,0,0
best_f1=0

model.zero_grad()

for idx in range(epochs): 
    bar = tqdm(train_dataloader,total=len(train_dataloader))
    tr_num=0
    train_loss=0
    for step, batch in enumerate(bar):
        
        (inputs, labels)=[x.to(device)  for x in batch]
        model.train()
        loss,logits = model(inputs, labels)
        loss.backward()
        torch.nn.utils.clip_grad_norm_(model.parameters(), max_grad_norm)

        tr_loss += loss.item()
        tr_num+=1
        train_loss+=loss.item()
        if avg_loss==0:
            avg_loss=tr_loss
            
        avg_loss=round(train_loss/tr_num,5)
        bar.set_description("epoch {} loss {}".format(idx,avg_loss))
            
        if (step + 1) % gradient_accumulation_steps == 0:
            optimizer.step()
            optimizer.zero_grad()
            scheduler.step()  
            global_step += 1
            output_flag=True
            avg_loss=round(np.exp((tr_loss - logging_loss) /(global_step- tr_nb)),4)

            if global_step % save_steps == 0:   
                # Save model checkpoint
                y_preds=[]
                y_trues=[]

                for ind, pair in valid.iterrows():
                    code_1, code_2, label = codes[pair.id1], codes[pair.id2], pair.label 
                    example = convert_examples_to_features_with_label(code_1, code_2, label)
                    source_ids = torch.tensor(example[0]).to(device)
                    prediction = model(source_ids)
                    prediction = int(torch.argmax(prediction[0]))
                    y_preds.append(prediction)
                    y_trues.append(example[1])
                    
                precision, recall, eval_f1, accuracy = evaluate(y_trues, y_preds)
                if eval_f1>best_f1:
                    best_f1=eval_f1#results['eval_f1']
                    print("Best f1:",round(best_f1,4))                         
                    output_dir = 'saved_models/checkpoint-best-f1/'               
                    model_to_save = model.module if hasattr(model,'module') else model
                    output_dir = os.path.join(output_dir, '{}'.format(f"model_{benchmark}.bin")) 
                    torch.save(model_to_save.state_dict(), output_dir)
                    print("Saving model checkpoint to ", output_dir)


# In[23]:

print("check point 3")
config = RobertaConfig.from_pretrained('microsoft/codebert-base')
model = RobertaModel.from_pretrained('microsoft/codebert-base')
tokenizer = RobertaTokenizer.from_pretrained('microsoft/codebert-base')
model = Model(model,config,tokenizer)
model_path = f"saved_models/checkpoint-best-f1/model_{benchmark}.bin"
model.load_state_dict(torch.load(model_path, map_location=lambda storage, loc: storage), strict=False)
model.to(device)

BLOCK_SIZE=512

y_preds=[]
y_trues=[]

for ind, pair in test.iterrows():
    code_1, code_2, label = codes[pair.id1], codes[pair.id2], pair.label 
    example = convert_examples_to_features_with_label(code_1, code_2, label)#convert_examples_to_features(code_1, code_2)
    source_ids = torch.tensor(example[0]).to(device)
    prediction = model(source_ids)
    prediction = int(torch.argmax(prediction[0]))
    y_preds.append(prediction)
    y_trues.append(example[1])
    
    
def evaluate(y_trues, y_preds):
    accuracy= accuracy_score(y_trues, y_preds)
    f1 = f1_score(y_trues, y_preds)
    precision = precision_score(y_trues, y_preds)
    recall = recall_score(y_trues, y_preds)
    #print('precision: {0}, recall: {1}, f1: {2}, accuracy: {2}'.format(precision, recall, f1, accuracy))
    return precision, recall, f1, accuracy

precision, recall, f1, accuracy = evaluate(y_trues, y_preds)
print('precision: {0}, recall: {1}, f1: {2}, accuracy: {2}'.format(precision, recall, f1, accuracy))    


# In[ ]:




