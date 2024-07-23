def solution (S, P, Q): 
    result = [0 for i in range(len(P))] 
    factor1 = [0 for i in range(len(S))] 
    factor2 = [0 for i in range(len(S))] 
    factor3 = [0 for i in range(len(S))]
    factor4 = [0 for i in range(len(S))]
    factor1Sum = 0
    factor2Sum = 0
    factor3Sum = 0
    factor4Sum = 0
    for i in range(len(S)):
        if S[i] == 'A':
            factor1Sum += 1
        if S[i] == 'C':
            factor2Sum += 1
        if S[i] == 'G':
            factor3Sum += 1
        if S[i] == 'T':
            factor4Sum += 1
        factor1[i] = factor1Sum
        factor2[i] = factor2Sum
        factor3[i] = factor3Sum
        factor4[i] = factor4Sum
    
    for i in range(len(P)):
        start = P[i]
        end = Q[i]
        if start == 0:
            if factor1[end] > 0:
                result[i] = 1
            elif factor2[end] > 0:
                result[i] = 2
            elif factor3[end] > 0:
                result[i] = 3
            else: 
                result[i] = 4
        else:
            if factor1[end] > factor1[start-1]:
                result[i] = 1
            elif factor2[end] > factor2[start-1]:
                result[i] = 2
            elif factor3[end] > factor3[start-1]:
                result[i] = 3
            else:
                result[i] = 4
    return result