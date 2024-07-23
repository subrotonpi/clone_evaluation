def myTrim(input, list): 
    r = "" 
    for i in range(len(input)): 
        k = 0
        for j in range(len(list)): 
            if input[i] == list[j]: 
                break
            k += 1
        if k == len(list):
            r += input[i] 
    return r