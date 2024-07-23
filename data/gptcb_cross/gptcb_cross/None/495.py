def solution(X, A): 
    hset = set() 
    for i in range(len(A)): 
        if A[i] <= X: 
            hset.add(A[i]) 
            if len(hset) == X: 
                return i 
    return -1