def removeDuplicates(arr): 
    map = 0
    for i in range(len(arr)): 
        if map & (1 << (ord(arr[i]) - ord('a'))) > 0: 
            arr[i] = 0
        else: 
            map |= 1 << (ord(arr[i]) - ord('a'))