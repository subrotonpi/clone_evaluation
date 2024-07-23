def solution (X, A): 
    set_ = set() 
    sum1 = 0
    sum2 = 0
    for i in range(0, X+1): 
        sum1 += i 
    for i in range(len(A)): 
        if A[i] in set_: 
            continue
        set_.add(A[i]) 
        sum2 += A[i] 
        if sum1 == sum2: 
            return i
    return -1