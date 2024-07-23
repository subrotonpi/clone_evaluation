def solution(S, P, Q):
    N = len(S)
    M = len(P)
    result = [0] * M
    lastoccurrencesmap = [[0 for i in range(N)] for i in range(3)]
    lastA = -1
    lastC = -1
    lastG = -1
    for i in range(N):
        c = S[i]
        if c == 'A':
            lastA = i
        elif c == 'C':
            lastC = i
        elif c == 'G':
            lastG = i
        lastoccurrencesmap[0][i] = lastA
        lastoccurrencesmap[1][i] = lastC
        lastoccurrencesmap[2][i] = lastG
    
    for i in range(M):
        startIndex = P[i]
        endIndex = Q[i]
        minimum = 4
        for n in range(3):
            lastoccurence = getLastNucleotideOccurrence(startIndex, endIndex, n)
            if lastoccurence != 0:
                minimum = n + 1
                break
        result[i] = minimum
    
    return result