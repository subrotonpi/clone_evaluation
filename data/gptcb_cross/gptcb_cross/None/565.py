def solution(S, P, Q):
    N = len(S)
    M = len(P)
    result = [0] * M
    lastOccurencesMap = [[0,0,0] for _ in range(N)]
    lastA, lastC, lastG = -1, -1, -1
    for i,c in enumerate(S):
        if c == "A":
            lastA = i
        elif c == "C":
            lastC = i
        elif c == "G":
            lastG = i
        lastOccurencesMap[i] = [lastA, lastC, lastG]

    for i in range(M):
        startIndex, endIndex = P[i],Q[i]
        minimum = 4
        for n in range(3):
            lastOccurence = getLastNucleotideOccurrence(startIndex, endIndex, n)
            if lastOccurence != 0:
                minimum = n+1
                break
        result[i] = minimum
    return result