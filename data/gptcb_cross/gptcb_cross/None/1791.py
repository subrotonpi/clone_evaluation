def solution(X, A):
    seen = set() 
    sum1 = 0
    sum2 = 0
    for i in range(X + 1):
        sum1 += i
    for i in range(len(A)):
        if A[i] in seen:
            continue 
        seen.add(A[i])
        sum2 += A[i] 
        if sum1 == sum2: 
            return i 
    return -1