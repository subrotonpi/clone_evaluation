def solution(X, A):
    len = len(A)
    if X > len: 
        return -1
    isFilled = [0] * X 
    jumped = 0
    for i in range(len):
        x = A[i]
        if x <= X:
            if isFilled[x-1] == 0:
                isFilled[x-1] = 1
                jumped += 1
                if jumped == X:
                    return i
    return -1