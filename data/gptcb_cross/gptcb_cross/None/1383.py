def solution(X, A):
    count = [0]*X
    for i in range(len(A)):
        try:
            count[A[i] - 1] += 1
        except IndexError:
            pass
        if i >= X - 1:
            for j in range(X):
                if count[j] == 0:
                    break
                if j == X-1:
                    return i
    return -1