def solution(X,A):
    leaves = set()        
    for i in range(len(A)):
        leaves.add(A[i])
        if X in leaves and len(leaves) == X:
            return i
    return -1