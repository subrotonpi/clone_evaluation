def save_to_file(fn, text, ext):
    fn = "gptcb_cross/gptcb_cross/None/" + f"{fn}.{ext}" #change here
    with open(fn, 'w') as file:
        # text = 
        file.write(text)
        
import json    
with open("gptcb_cross/data_including_unparsable.jsonl", "r") as data: #read appropriate file
    data = list(data)
    for line in data:
        e = json.loads(line)
        i = e['idx']
        c = e['func']
        ext = e['lang']
        
        # print(i, c)
        save_to_file(i, c, ext)