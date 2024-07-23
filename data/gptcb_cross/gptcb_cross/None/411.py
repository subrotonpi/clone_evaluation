def isPermutation(str1, str2): 
    x = sorted(str1) 
    y = sorted(str2) 

    if (x == y): 
        return True
    else: 
        return False