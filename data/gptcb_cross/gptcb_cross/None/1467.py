def solution(S,P,Q):
    N = len(S)
    M = len(P)
    result = []
    lastOccurrencesMap = [[0 for x in range(N)] for y in range(3)] 
  
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
            lastOccurence = getLastNucleotideOccurrence(startIndex, endIndex, n)
            if lastOccurence != 0:
                minimum = n + 1
                break
        result.append(minimum) 

    return result