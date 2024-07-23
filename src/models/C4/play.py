def jsonl_to_df(jf):
        import json
        import pandas as pd
        with open(jf, 'r') as json_file:
            json_list = list(json_file)
        x = []
        for json_str in json_list:
            result = json.loads(json_str)
            x.append([int(result['idx']), result['func']])
        return pd.DataFrame(x, columns=['idx','func'])

codes = jsonl_to_df('/home/egk204/PycharmProjects/clone-type-iv/mutation_for_dl_models/mutants_json/type1/mCC_BT.jsonl')
codes= dict(codes[['idx', 'func']].values)
print(type(codes))
print(codes.keys())
print(codes[10002])
    