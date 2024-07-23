def solution(N): 
    result = 0
    while (N > 0): 
        if N & 1 == 1: 
            temp = 0
            while (N>>= 1) > 0 and (N & 1 != 1):
                temp+=1
            result = max(result, temp)
        else:
            N>>= 1
    return result