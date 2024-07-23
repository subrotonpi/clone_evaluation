def solution(X, A): 
    values = set() 
    for i in range(len(A)): 
        if A[i] not in values: 
            values.add(A[i])
            X-=1
            if X==0: 
                return i
    return -1