def replace (oldStr, newStr, input): 
    output = "" 
    i = 0 
    while i < len(input): 
        if input[i:i+len(oldStr)] == oldStr: 
            output = output + newStr 
            i = i + len(oldStr) 
        else: 
            output = output + input[i] 
            i = i + 1 
    return output