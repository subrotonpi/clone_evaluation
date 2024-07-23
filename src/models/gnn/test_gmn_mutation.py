import torch
import torch.nn as nn
import torch.nn.functional as F
import torch.optim as optim
import argparse
from tqdm import tqdm, trange
from createclone_mutation import createast,creategmndata,createseparategraph
import models
import random
import os
import numpy as np
from pathlib import Path
project_root = str(Path(__file__).parents[3])

    
def create_batches(data):
    #random.shuffle(data)
    batches = [data[graph:graph+args.batch_size] for graph in range(0, len(data), args.batch_size)]
    return batches

def test(args, model, dataset, device):
    count=0
    correct=0
    results=[]
    tp = 0
    tn = 0
    fp = 0
    fn = 0
    
    for data,label in dataset:
        label=torch.tensor(label, dtype=torch.float, device=device)
        x1, x2, edge_index1, edge_index2, edge_attr1, edge_attr2=data
        x1=torch.tensor(x1, dtype=torch.long, device=device)
        x2=torch.tensor(x2, dtype=torch.long, device=device)
        edge_index1=torch.tensor(edge_index1, dtype=torch.long, device=device)
        edge_index2=torch.tensor(edge_index2, dtype=torch.long, device=device)
        if edge_attr1!=None:
            edge_attr1=torch.tensor(edge_attr1, dtype=torch.long, device=device)
            edge_attr2=torch.tensor(edge_attr2, dtype=torch.long, device=device)
        data=[x1, x2, edge_index1, edge_index2, edge_attr1, edge_attr2]
        prediction=model(data)
        output=F.cosine_similarity(prediction[0],prediction[1])
        prediction = torch.sign(output).item()
        if prediction>args.threshold and label.item()==1:
            tp+=1
            #print('tp')
        if prediction<=args.threshold and label.item()==-1:
            tn+=1
            #print('tn')
        if prediction>args.threshold and label.item()==-1:
            fp+=1
            #print('fp')
        if prediction<=args.threshold and label.item()==1:
            fn+=1
            #print('fn')
    print(tp,tn,fp,fn)
    p=0.0
    r=0.0
    f1=0.0
    if tp+fp==0:
        print('precision is none')
        return
    p=tp/(tp+fp)
    if tp+fn==0:
        print('recall is none')
        return
    r=tp/(tp+fn)
    f1=2*p*r/(p+r)
    # print('precision')
    # print(p)
    # print('recall')
    # print(r)
    # print('F1')
    # print(f1)
        
    return [p,r,f1]

'''    from datetime import datetime
    now = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
    res = str(args.graphmode) + str(now)+':     '+args.bench+' Precision: '+str(p)+'  Recall: '+str(r)+'  F1: '+str(f1) +'\n'
'''
def set_seed(seed=42):
    random.seed(seed)
    os.environ['PYHTONHASHSEED'] = str(seed)
    np.random.seed(seed)
    torch.manual_seed(seed)
    torch.cuda.manual_seed(seed)
    torch.backends.cudnn.deterministic = True
    
parser = argparse.ArgumentParser()
parser.add_argument("--cuda", default=False)
parser.add_argument("--storage", default='bcb')
parser.add_argument("--graphmode", default='astandnext')
parser.add_argument("--nextsib", default=False)
parser.add_argument("--ifedge", default=False)
parser.add_argument("--whileedge", default=False)
parser.add_argument("--foredge", default=False)
parser.add_argument("--blockedge", default=False)
parser.add_argument("--nexttoken", default=False)
parser.add_argument("--nextuse", default=False)
parser.add_argument("--data_setting", default='0')
parser.add_argument("--batch_size", default=32)
parser.add_argument("--num_layers", default=4)
parser.add_argument("--num_epochs", default=10)
parser.add_argument("--lr", default=0.001)
parser.add_argument("--threshold", default=0)
parser.add_argument("--data", default=project_root+'data/')
parser.add_argument('--root' , default=project_root+'/src/models/gnn/')
parser.add_argument("--bench",default='scb')
parser.add_argument("--saved_model_path", default= '/home/egk204/PycharmProjects/clone-type-iv/src/models/gnn/saved_models/gmn_astandnext_bcb_9')
parser.add_argument("--mutation_operator", default='None')
parser.add_argument("--muttion_data", default='mutation_for_dl_models/mutants_json/')
parser.add_argument("--current_dataset", default=[])
args = parser.parse_args()
#set_seed()
device= torch.device("cuda") if torch.cuda.is_available() else torch.device("cpu")#
vocablen=77535
import os
source = "/home/egk204/PycharmProjects/clone-type-iv/mutation_for_dl_models/mutants_json/"

mutants_files=[]
for root, dirs, files in os.walk(source, topdown=False):
    for file in files:
        ctype = root.split('/')[-1]
        op = file.split('.')[0]
        full_path = os.path.join(root, file)
        # print(ctype, op, full_path)
        mutants_files.append([ctype, op, full_path])

#print(mutants_files)

all_result = []
for mf in mutants_files:
    args.current_dataset=mf
    print(args.current_dataset[2])
    
    astdict,_,vocabdict=createast(args) #load saved voabdict for original dataset it was trained on (BCB)
    treedict=createseparategraph(args, astdict,vocablen, vocabdict,device,mode=args.graphmode,nextsib=args.nextsib,ifedge=args.ifedge,whileedge=args.whileedge,foredge=args.foredge,blockedge=args.blockedge,nexttoken=args.nexttoken,nextuse=args.nextuse)
    testdata=creategmndata(args, args.data_setting,treedict,vocablen,vocabdict,device) #traindata,validdata, 
    num_layers=int(args.num_layers)
    model=models.GMNnet(vocablen=77535,embedding_dim=100,num_layers=num_layers,device=device).to(device)
    model.load_state_dict(torch.load(args.saved_model_path, map_location=device))
    model.eval()
    res = test(args, model, testdata, device)
    print(res)
    
    ctype = args.current_dataset[0]
    op = args.current_dataset[1]
    tmp = [ctype, op]+res
    all_result.append(tmp)
    # print(tmp)
import pandas as pd
print(all_result)
r = pd.DataFrame(all_result, columns=['clone_type','operator', 'precision', 'recall', 'f1'])
r.to_csv('gmn_mutation_results.csv', index=False, header=False)