def solution(X, A):
    length = len(A)
    if X > length:
        return -1
    isFilled = [0] * X
    jumped = 0
    for i, x in enumerate(A):
        if x <= X:
            if isFilled[x-1] == 0:
                isFilled[x-1] = 1
                jumped += 1
                if jumped == X:
                    return i
    return -1