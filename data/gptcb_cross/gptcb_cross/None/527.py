def camelCaser(str): 
    words = str.split("_")
    res = ""
    for word in words: 
        if len(word) != 0: 
            res += word[0].upper()
            if len(word) > 1: 
                res += word[1:]
    return res