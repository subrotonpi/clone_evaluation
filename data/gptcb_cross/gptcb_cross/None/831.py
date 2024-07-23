def solution(X, A):
    emptyPosition = set(range(1, X+1))
    for i in range(len(A)):
        emptyPosition.discard(A[i])
        if len(emptyPosition) == 0:
            return i
    return -1