def removeDuplicates(arr): 
    set_ = {} 
    total_items = 0 
    for i in arr: 
        if i not in set_: 
            set_[i] = True
            total_items += 1
    res = [0] * total_items 
    c = 0
    for i in range(len(set_)): 
        if set_[i]: 
            res[c] = i
            c += 1 
    return res