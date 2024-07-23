def amountOTP (a, x): 
    b = [[0 for _ in range(x)] for _ in range(x)] 
    x = min(x, len(a)) 
    for i in range(x): 
        for j in range(x): 
            b[i][j] = a[i][j] 
    return b