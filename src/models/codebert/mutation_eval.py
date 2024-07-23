#!/usr/bin/env python
# coding: utf-8

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
from tqdm.notebook import tqdm
import os
import pandas as pd
import random

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
def get_codes(dt_path):
    codes={}
    #dt_path = 'dataset/data.jsonl'
    with open(dt_path) as f:
        for line in f:
            line=line.strip()
            js=json.loads(line)
            codes[js['idx']]=js['func']
    return codes
def evaluate(y_trues, y_preds):
    accuracy= accuracy_score(y_trues, y_preds)
    f1 = f1_score(y_trues, y_preds)
    precision = precision_score(y_trues, y_preds)
    recall = recall_score(y_trues, y_preds)
    #print('precision: {0}, recall: {1}, f1: {2}, accuracy: {2}'.format(precision, recall, f1, accuracy))
    return [precision, recall, f1]
if __name__=='__main__':

    device = 'cuda' if torch.cuda.is_available else 'cpu'
    print('Using device: ', device)
    config = RobertaConfig.from_pretrained('microsoft/codebert-base')
    model = RobertaModel.from_pretrained('microsoft/codebert-base')
    tokenizer = RobertaTokenizer.from_pretrained('microsoft/codebert-base')
    model = Model(model,config,tokenizer)
    model_path = 'saved_models/checkpoint-best-f1-bcb/model.bin'
    model.load_state_dict(torch.load(model_path, map_location=lambda storage, loc: storage), strict=False)
    model.to(device)

    BLOCK_SIZE=400

    #same test pairs
    test = pd.read_csv('/home/egk204/PycharmProjects/clone-type-iv/data/scb/scb_pairs.csv', names=['id1', 'id2', 'label'])
    

    source = "/home/egk204/PycharmProjects/clone-type-iv/mutation_for_dl_models/mutants_json"

    current_dataset = []
    mutants_files=[]
    for root, dirs, files in os.walk(source, topdown=False):
        for file in files:
            check=file.split('.')[-1]
            if check == 'jsonl':
                ctype = root.split('/')[-1]
                op_ = file.split('.')[0]
                full_path = os.path.join(root, file)
                mutants_files.append([ctype, op_, full_path])

    results = []

    for mf in mutants_files:
        codes = get_codes(mf[2])
        
        y_preds=[]
        y_trues=[]
        count_missing = 0
        for ind, pair in test.iterrows():
            try:
                code_1, code_2, label = codes[pair.id1], codes[pair.id2], pair.label 
                example = convert_examples_to_features_with_label(code_1, code_2, label) 
                source_ids = torch.tensor(example[0]).to(device)
                prediction = model(source_ids)
                prediction = int(torch.argmax(prediction[0]))
                y_preds.append(prediction)
                y_trues.append(example[1])
            except:
                count_missing+=1
                continue
            
            


        p_r_f1 = evaluate(y_trues, y_preds)
        res = [mf[0], mf[1]]+p_r_f1
        results.append(res)
        print('total evaluated', len(test)-count_missing, p_r_f1)
        #print('precision: {0}, recall: {1}, f1: {2}'.format(precision, recall, f1))

    print(results)
    import pandas as pd
    dr = pd.DataFrame(results, columns=['clone_type', 'operator', 'p', 'r','f1'])
    dr.to_csv('mutation_result_codebert.csv', index=False)