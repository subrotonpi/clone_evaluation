def solution(S, P, Q): 
    character_input = list(S) 
    integer_input = [0] * len(character_input) 
    
    for i in range(len(character_input)): 
        integer_input[i] = character_mapping[character_input[i]] 
    result = [0] * len(P) 
    
    for i in range(len(P)): 
        if P[i] == Q[i]: 
            result[i] = integer_input[P[i]] 
            break 
        sub_list = integer_input[P[i] : Q[i] + 1] 
        minimum_value = min(sub_list) 
        result[i] = minimum_value 
    return result