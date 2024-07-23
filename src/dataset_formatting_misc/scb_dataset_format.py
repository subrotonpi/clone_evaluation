import pandas as pd
import numpy as np
import jsonlines, random
import os, torch


def split_data(data):
    
    data_num = len(data)
    ratios = [8,1,1]
    
    train_split = int(ratios[0]/sum(ratios)*data_num)
    val_split = train_split + int(ratios[1]/sum(ratios)*data_num)

    data = data.sample(frac=1, random_state=42)
    train = data.iloc[:train_split]
    val = data.iloc[train_split:val_split]
    test = data.iloc[val_split:]
    return train, val, test

def set_seed(seed=42):
    random.seed(seed)
    os.environ['PYHTONHASHSEED'] = str(seed)
    np.random.seed(seed)
    torch.manual_seed(seed)
    torch.cuda.manual_seed(seed)
    torch.backends.cudnn.deterministic = True
set_seed()
###########
data_dir = '../data/'
###########
#convert to JSONL:func/idx
df = pd.read_pickle(data_dir+'/scb/data.pkl')
df.columns=['idx', 'func']
temp = []
for ind, row in df.iterrows():
    x = {
        'idx' : row.idx,
        'func' : row.func
    }
    temp.append(x)

with jsonlines.open(data_dir+'/scb/data.jsonl', 'w') as writer:
    writer.write_all(temp)

#convert to csv: pair/label
df = pd.read_pickle(data_dir+'/scb/scb_pair_ids.pkl')
df[df.label==1].to_csv(data_dir+'/scb/pos.csv', header=None, index=False)
train, valid, test = split_data(df)
train.to_csv(data_dir+'/scb/train.csv', index=False, header=None)
valid.to_csv(data_dir+'/scb/valid.csv', index=False, header=None)
test.to_csv(data_dir+'/scb/test.csv', index=False, header=None)

########

# fragments = pd.read_csv(data_dir+'scb/'+'scb_funcs_all.tsv', sep='\t', header=None)
# fragments = dict(fragments.values)
# fragments = pd.DataFrame(fragments.items())
# fragments.to_pickle(data_dir+'scb/data.pkl')
