import torch
import torch.nn as nn
import torch.nn.functional as F
import torch.optim as optim
import argparse
from tqdm import tqdm, trange
from createclone import createast,creategmndata,createseparategraph
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
        if prediction>args.threshold:
            results.append([1]) #output.item()
        else:
            results.append([0]) #output.item(),
    return results

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
parser.add_argument("--bench",default='bcb')
parser.add_argument("--saved_model_path", default=project_root+'gmn')
args = parser.parse_args()
 

set_seed()
device=torch.device("cuda") if torch.cuda.is_available() else torch.device("cpu")#torch.device('cpu')
astdict,_,vocabdict=createast(args) #load saved voabdict for original dataset it was trained on (BCB)
treedict=createseparategraph(args, astdict, 77535, vocabdict,device,mode=args.graphmode,nextsib=args.nextsib,ifedge=args.ifedge,whileedge=args.whileedge,foredge=args.foredge,blockedge=args.blockedge,nexttoken=args.nexttoken,nextuse=args.nextuse)
traindata,validdata, testdata=creategmndata(args, args.data_setting,treedict,77535,vocabdict,device)
#traindata,validdata,testdata=creategmndata(args, args.data_setting,treedict,vocablen,vocabdict,device)
num_layers=int(args.num_layers)
model=gmn.models.GMNnet(vocablen=77535,embedding_dim=100,num_layers=num_layers,device=device).to(device)
model.load_state_dict(torch.load(args.saved_model_path, map_location=device))
model.eval()

res = test(args, model, testdata, device)

import pandas as pd
pairs_df = pd.read_csv(pair_info, names=['code1', 'code2'])
pairs_df['prediction'] = pd.Series(res)
df_res = pd.DataFrame(res, columns=['prediction']) #output.item(), add this in test
pd.concat([pairs_df, df_res], axis=1).to_csv(args.root+str(+args.bench)+'_gmn_predictions.csv', index=None)