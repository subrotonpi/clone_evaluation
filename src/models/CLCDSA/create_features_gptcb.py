import pandas as pd

def get_clcdsa_dataset (bench, feat, pairs_name):
    pairs = pd.read_csv(f'../../../data/{bench}/{pairs_name}.csv', names=['id1', 'id2', 'label'])
    #print(pairs)
    
    feat['id'] = [i_.split('/')[-1].split('.')[0] for i_ in feat['file_path']]
    print(feat.file_path[0], feat.id[0])
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

bench = "gptcb"
#cross
# bench = "gptcb_cross"

save_dir = 'gptcb'
pa = f"features/{bench}/"
k = ['file_path','variable', 'arguments', 'operators', 'expressions', 'loops','operands', 'exceptions', 'exception_clause', 'mccable_complex']
#cross
# f_java = pd.read_csv(f"{pa}/None_java_features.csv", names=k)
# f_py = pd.read_csv(f"{pa}/None_python_features.csv", names=k)
# ft = pd.concat([f_java, f_py])
# c= "cross"

#single
ft = pd.read_csv(f"{pa}/None_java_features.csv", names=k)
c = "java"

print(ft.shape)

pairs_name = ["train", "test", "valid"]
for t in pairs_name:
    temp_data = get_clcdsa_dataset(bench, ft, t)
    p = f"{save_dir}/clcdsa_gptcb_{c}_{t}.csv"
    temp_data.to_csv(p, header=None, index=False)
    print(temp_data.shape)
    
print('done!!!')