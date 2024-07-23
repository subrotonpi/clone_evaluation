def solution(S, P, Q):
    arr = [0] * len(S)
    for i in range(len(S)):
        if S[i] == 'A':
            arr[i] = 1
        elif S[i] == 'C':
            arr[i] == 2
        elif S[i] == 'G':
            arr[i] == 3
        elif S[i] == 'T':
            arr[i] == 4
    root = buildTree(arr, 0, len(S)-1)
    result = [0] * len(P)
    for i in range(len(P)):
        result[i] = getMin(root, P[i], Q[i])
    return result