import os
source = "/home/egk204/PycharmProjects/clone-type-iv/mutation_for_dl_models/mutants_json/"

mutants_files = []
for root, dirs, files in os.walk(source, topdown=False):
    for file in files:
        ctype = root.split('/')[-1]
        op = file.split('.')[0]
        full_path = os.path.join(root, file)
        print(ctype, op, full_path)
        mutants_files.append([ctype, op, full_path])

#print(mutants_files)

# import pandas as pd
# ds = pd.read_pickle("/home/egk204/PycharmProjects/clone-type-iv/data/scb/scb_pair_ids.pkl")
# print(ds)
# #ds.to_csv('/home/egk204/PycharmProjects/clone-type-iv/data/scb/scb_pairs.csv', index=False, header=False)
