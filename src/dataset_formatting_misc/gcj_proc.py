import os
import pandas as pd
import jsonlines

def process(p=data_dir+'/gcj/javadata/trainall.txt'):
    t = pd.read_csv(p, sep=' ', header=None)
    df=pd.DataFrame()
    df['id1']=t[0].str.replace('\\','/')
    df['id2']=t[1].str.replace('\\','/')
    df['label'] = t[2]
    df['label']=df['label'].replace(-1, 0)
    return df

def mapid(df, mapping):
    ids = ['id1', 'id2']
    for i in ids:
        df[i] = df[i].apply(lambda x: mapping[x])
    return df
#########

data_dir = "../data"
# read from text files
x = []
for root, dirs, files in os.walk("../data/gcj/googlejam4_src/", topdown=False):
   for name in files:
      s = os.path.join(root, name)
      x.append(['/'.join(s.split('/')[3:]), ''.join(open(s).readlines())])

data = pd.DataFrame(x, columns=['idx', 'func'])
train = process(data_dir+'/gcj/javadata/trainall.txt')
valid = process(data_dir+'/gcj/javadata/valid.txt')
test = process(data_dir+'/gcj/javadata/test.txt')
print(train.shape, valid.shape, test.shape)


######
mapping = {item:i+1 for i, item in enumerate(data["idx"].unique())}
data['idx'] = data['idx'].apply(lambda x: mapping[x])
train = mapid(train, mapping)
valid = mapid(valid, mapping)
test = mapid(test, mapping)
train.to_csv(data_dir+'/gcj/train.csv', header=None, index=False)
valid.to_csv(data_dir+'/gcj/valid.csv', header=None, index=False)
test.to_csv(data_dir+'/gcj/test.csv', header=None, index=False)


data.columns=['idx', 'func']

temp = []
for ind, row in data.iterrows():
    x = {
        'idx' : row.idx,
        'func' : row.func
    }
    temp.append(x)

with jsonlines.open(data_dir+'/gcj/data.jsonl', 'w') as writer:
    writer.write_all(temp)
