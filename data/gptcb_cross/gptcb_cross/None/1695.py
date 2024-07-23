def solution(x, A):
    n = len(A)
    check = [False]*x
    cmp = 0
    time = -1
    
    for i in range(n):
        temp = A[i]
        if temp <= x:
            if check[temp - 1] is True:
                continue
            else:
                check[temp - 1] = True
                cmp += 1
        if cmp == x:
            time = i
            break
    return time