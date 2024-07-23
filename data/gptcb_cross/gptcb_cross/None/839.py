def solution(S, P, Q): 
    N = len(S) 
    answer = [0] * len(P) 
    for i in range(len(P)): 
        min_value = 5 

        A = 0 
        if P[i] - 1 >= 0: 
            A = Q[P[i] - 1] 

        C = 0 
        if P[i] - 1 >= 0: 
            C = Q[P[i] - 1] 

        G = 0 
        if P[i] - 1 >= 0: 
            G = Q[P[i] - 1] 

        T = 0 
        if P[i] - 1 >=0: 
            T = Q[P[i] - 1] 

        for j in range(P[i],Q[i] + 1): 
            if S[j] == 'A' and A == 0: 
                min_value = 1 
                break 

            if S[j] == 'C' and C == 0: 
                min_value = 2 
                break 

            if S[j] == 'G' and G == 0: 
                min_value = 3 
                break 

            if S[j] == 'T' and T == 0: 
                min_value = 4 
                break 

        answer[i] = min_value 
    return answer