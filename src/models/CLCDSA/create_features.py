import pandas as pd

def get_clcdsa_dataset (ft):
    pairs = pd.read_csv('/home/egk204/PycharmProjects/clone-type-iv/data/scb/valid.csv', names=['id1', 'id2', 'label'])
    #print(pairs)
    k = ['file_path','variable', 'arguments', 'operators', 'expressions', 'loops','operands', 'exceptions', 'exception_clause', 'mccable_complex']
    feat = pd.read_csv(ft, names=k)
    feat['id'] = [i_.split('/')[-1].split('.')[0] for i_ in feat['file_path']]
    #print(feat.file_path[0], feat.id[0])
    feat_to_get =['variable', 'arguments', 'operators', 'expressions', 'loops','operands', 'exceptions', 'exception_clause', 'mccable_complex']
    dset = []
    for ind, row in pairs.iterrows():
        try:
            x1 = feat[feat.id==str(row[0])][feat_to_get].values[0]
            x2 = feat[feat.id==str(row[1])][feat_to_get].values[0]
            label = row[2]
            t = list(x1)+ list(x2)+[label]
        except:
            # x1 = [0]*9
            # x2 = [0]*9
            # label = 1
            # t = list(x1)+ list(x2)+[label]
            continue
        dset.append(t)

    dset = pd.DataFrame(dset)
    #print(dset.shape)
    return dset

import os
source = "/home/egk204/PycharmProjects/clone-type-iv/src/cross/clcdsa_model/features/"
mutants_files=[]
for root, dirs, files in os.walk(source, topdown=False):
    for file in files:
        check=file.split('.')[1]
        if check == 'csv':
            ctype = root.split('/')[-1]
            op_ = '_'.join(file.split('.')[0].split('_')[:-2])
            full_path = os.path.join(root, file)
            # print(ctype, op, full_path)
            opdir= '/'.join(full_path.split('/')[:-1])
            mutants_files.append([ctype, op_, full_path, opdir])

#print(mutants_files)

b = '/home/egk204/PycharmProjects/clone-type-iv/src/cross/clcdsa_model/dataset_final'
for mf in mutants_files:
    temp_data = get_clcdsa_dataset(mf[2])
    p = b+'/'+mf[0]+'_'+mf[1]+'.csv'
    temp_data.to_csv(p, header=None, index=False)
    print(temp_data.shape,mf)
    
print('done!!!')