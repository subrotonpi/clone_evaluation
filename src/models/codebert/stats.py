import pandas as pd
import json
k = ['id1', 'id2', 'label']

train = pd.read_csv('dataset/train.txt',sep='\t', names=k)
test = pd.read_csv('dataset/test.txt',sep='\t', names=k)
valid = pd.read_csv('dataset/valid.txt',sep='\t', names=k)

total = pd.concat([train, test, valid])
total = pd.concat([train, test, valid])
print('pos: ', len(total[total.label==1]), 'neg: ', len(total[total.label==0]))
print('total: ', total.shape)

url_to_code = {}
lines = 0
frags = 0
codeset=set()

with open('dataset/data.jsonl') as f:
    for line in f:
        line=line.strip()
        js=json.loads(line)
        url_to_code[js['idx']]=js['func']
        
        tmp = js['func']
        codeset.add(tmp)
        
        frags+=1
        lines+= len(tmp.split('\n')) #LOC
        
#for scb ; for bcb set it false
scb = True
if scb:
    print("for SCB dataset: ")
    codelist= list(codeset)
    frags=len(codelist)
    lines = 0
    for c in codelist:
        lines+= len(c.split('\n')) #LOC
    

print('Total lines',lines, 'frags:, ',frags, 'avg lines: ', lines/frags)
        
        
        