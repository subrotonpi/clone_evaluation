def solution(S, P, Q):
    result = [0] * len(P)
    factor1 = [0] * len(S)
    factor2 = [0] * len(S)
    factor3 = [0] * len(S)
    factor4 = [0] * len(S)
    factor1_sum = 0
    factor2_sum = 0
    factor3_sum = 0
    factor4_sum = 0
    
    for i in range(len(S)):
        if S[i] == 'A':
            factor1_sum += 1
        elif S[i] == 'C':
            factor2_sum += 1
        elif S[i] == 'G':
            factor3_sum += 1
        elif S[i] == 'T':
            factor4_sum += 1
        factor1[i] = factor1_sum
        factor2[i] = factor2_sum
        factor3[i] = factor3_sum
        factor4[i] = factor4_sum
        
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
            if factor1[end] > factor1[start - 1]:
                result[i] = 1
            elif factor2[end] > factor2[start - 1]:
                result[i] = 2
            elif factor3[end] > factor3[start - 1]:
                result[i] = 3
            else:
                result[i] = 4
    
    return result