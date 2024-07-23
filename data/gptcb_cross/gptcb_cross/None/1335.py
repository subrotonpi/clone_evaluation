def main(args): 
    s = "[" + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test3\"}," + " {\"lon\": 0.002, \"lat\": 0.005, \"desc\": \"test4\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test5\"}," + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test2\"}]"
    
    json_string = json.loads(s) 
    tl = sorted(json_string, key=lambda l: (l['lon'], l['lat'])) 
    current = None
    fl = [] 
    for l in tl: 
        current = current or l
        if l == current: 
            current['desc'] = current['desc'] + ',' + l['desc'] 
        else: 
            fl.append(current) 
            current = l 
    print(json.dumps(fl))