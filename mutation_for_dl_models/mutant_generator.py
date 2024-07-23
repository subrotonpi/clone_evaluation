#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import subprocess
import pandas as pd
import json

def write_to_file(c, f_path='temp_dir'):
    f = open('temp_source.java', "w")
    f.write(c)
    f.close()
    
def run_txl_command(code='', tmp_val = '400', operator_path='mutators/java/',  operator='mARI.txl'):
    if operator=='mIL':
        tmp_val=600
        
    write_to_file(code)
    operator = str(operator_path + operator)
    source_file = 'temp_source.java' 
    target_file= 'temp_target.java'
    r = subprocess.run(['ulimit', '-s', 'hard'])
    r = subprocess.run([ 'txl', '-s', tmp_val, '-o', target_file, source_file, operator])
    return open(target_file).read()


def read_scb_codes():
    #test = pd.read_csv('../data/scb/test.csv', names=['id1', 'id2', 'label'])
    codes={}
    dt_path = '../data/scb/data.jsonl'
    with open(dt_path) as f:
        for line in f:
            line=line.strip()
            js=json.loads(line)
            codes[js['idx']]=js['func']
    return codes

import jsonlines
def dict_to_json(d,var):
    temp = []
    for k, v in d.items():
        x = {
            'idx' : k,
            'func' : v
        }
        temp.append(x)

    with jsonlines.open('mutants_json/type1/'+str(var)+'.jsonl', 'w') as writer:
        writer.write_all(temp)
        
if __name__=="__main__":
    #Type-1
    # mCW_A Addition of whitespace.
    # mCW_R Removal of whitespace.
    # mCC_BT Change in between token (/* */) comments.
    # mCC_EOL Change in end of line (//) comments.
    # mCF_A Change in formatting (addition of a newline). 
    # mCF_R Change in formatting (removal of a newline).

    #Type-2
    #mSRI = Systematic renaming of an identifier
    #mARI = Arbitrary renaming of an identifier
    #mRL_N = Change in value of a numeric literal
    #mRL_S = Change in value of a string or character literal
    
    #Type-3
    #mSIL = Small insertion within a line
    #mSDL = Small deletion within a line
    #mIL = line insertion
    #mDL = line deletion
    #mML = modification of whole line
    
    operators = ['mCW_A','mCW_R','mCC_BT','mCC_EOL','mCF_A','mCF_R']#['mSRI', 'mARI', 'mRL_N', 'mRL_S']#['mSIL', 'mSDL', 'mIL', 'mDL', 'mML']

    codes = read_scb_codes()
    
    op_dict={} #main dictionary to hold all mutant fragments
    for op in operators:
        tmp={}
        for index, code in codes.items():
            mutant_code = run_txl_command(code=code, operator= op+'.txl')
            tmp[index] = mutant_code
        #op_dict[op] = tmp
        dict_to_json(tmp, op)
    
    # for k, v in op_dict.items():
    #     dict_to_json(v, k)
    


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




