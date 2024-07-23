def solution(S, P, Q):
    N = len(S)
    M = len(P)
    result = [0] * M
    lastOccurrencesMap = [[0] * N for _ in range(3)]
    lastA = -1
    lastC = -1
    lastG = -1

    for i in range(N):
        if S[i] == 'A':
            lastA = i
        elif S[i] == 'C':
            lastC = i
        elif S[i] == 'G':
            lastG = i
        lastOccurrencesMap[0][i] = lastA
        lastOccurrencesMap[1][i] = lastC
        lastOccurrencesMap[2][i] = lastG
    
    for i in range(M):
        startIndex = P[i]
        endIndex = Q[i]
        minimum = 4
        for n in range(3):
            lastOccurrence =  getLastNucleotideOccurrence(startIndex, endIndex, n)
            if lastOccurrence != 0:
                minimum = n + 1
                break
        result[i] = minimum
    return result