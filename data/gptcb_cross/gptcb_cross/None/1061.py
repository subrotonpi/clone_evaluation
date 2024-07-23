def merge(*strings): 
    max_length = 0 
    sb = "" 
    for s in strings: 
        if len(s) > max_length: 
            max_length = len(s) 
    for i in range(max_length): 
        for s in strings: 
            if len(s) > i: 
                sb += s[i]
    return sb