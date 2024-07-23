def solution(X, A):
    empty_position = set(range(1, X+1))
    for i in range(0, len(A)):
        if A[i] in empty_position:
            empty_position.remove(A[i])
        if not empty_position:
            return i
    return -1