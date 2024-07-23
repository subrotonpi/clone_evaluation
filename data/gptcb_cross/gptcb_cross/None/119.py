def solution(X, A):
    leaves = set()
    for i, val in enumerate(A):
        leaves.add(val)
        if X in leaves and len(leaves) == X:
            return i
    return -1