def solution(X, A):
    check = [0] * X
    cmp = 0
    time = -1
    for x in range(len(A)):
        temp = A[x]
        if temp <= X:
            if check[temp - 1] > 0:
                continue
            check[temp - 1] += 1
            cmp += 1
        if cmp == X:
            time = x
            break

    return time