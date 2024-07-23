def filter(source, start, end, dest, dstart, dend):   
    dotPos = -1
    len = len(dest) 
    for i in range(len): 
        c = dest[i] 
        if c == '.'or c == ',': 
            dotPos = i
            break
    if dotPos >= 0: 
        if source == "." or source == ",": 
            return "" 
        if dend <= dotPos:  
            return None 
        if len - dotPos > decimalDigits: 
            return ""           
    return None