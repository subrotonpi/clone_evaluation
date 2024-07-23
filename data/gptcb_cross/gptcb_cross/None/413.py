def solution(S, P, Q): 
    N = len(S) 
    M = len(P) 
    result = [0] * M 
    lastOccurrencesMap = [[-1] * N for _ in range(3)] 
    lastA = lastC = lastG = -1  
    for i in range(N): 
        c = S[i] 
        if c == 'A': 
            lastA = i 
        elif c == 'C': 
            lastC = i 
        elif c == 'G': 
            lastG = i 
        lastOccurrencesMap[0][i] = lastA 
        lastOccurrencesMap[1][i] = lastC 
        lastOccurrencesMap[2][i] = lastG
    
    for i in range(M): 
        startIndex = P[i] 
        endIndex = Q[i] 
        minimum = 4
        for n in range(3): 
            lastOccurence = getLastNucleotideOccurrence(startIndex, endIndex, n, lastOccurrencesMap) 
            if lastOccurence != 0: 
                minimum = n + 1 
                break
        result[i] = minimum 
    return result
def getLastNucleotideOccurrence(startIndex, endIndex, n, lastOccurrencesMap): 
    if startIndex == 0:
        return lastOccurrencesMap[n][endIndex]
    else: 
        return lastOccurrencesMap[n][endIndex] - lastOccurrencesMap[n][startIndex - 1]