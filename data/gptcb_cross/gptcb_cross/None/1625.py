def solution(X, A):
    leaves = set()
    for i, v in enumerate(A):
        leaves.add(v)
        if X in leaves and len(leaves) == X:
            return i
    return -1