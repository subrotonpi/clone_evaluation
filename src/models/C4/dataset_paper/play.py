import pandas as pd
import json
codes = set()
nlines = 0 

def helper(filename):
    global nlines
    with open(filename,encoding="utf-8") as f:
        for line in f:
            line=line.strip()
            js=json.loads(line)
            code1 = ' '.join(js['Code1'].replace('\n', ' ').strip().split())
            code2 = ' '.join(js['Code2'].replace('\n', ' ').strip().split())
            codes.add(code1)
            codes.add(code2)
   
            nlines = nlines+ int(len(js['Code1'].split('\n'))) + int(len(js['Code2'].split('\n')))
        print(nlines)
if __name__=='__main__':

          
    helper('pair_train.jsonl')
    helper('pair_test.jsonl')
    helper('pair_valid.jsonl')

    print(len(list(codes)))
    print(len(list(codes))/nlines)
