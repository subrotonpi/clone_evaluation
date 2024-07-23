def solution(S, P, Q):
    characterInput = list(S)
    integerInput = [0]*len(characterInput)
    for i in range(len(characterInput)):
        integerInput[i] = characterInput[i]
    result = [0]*len(P)
    for i in range(len(P)):
        if P[i] == Q[i]:
            result[i] = integerInput[P[i]]
            break
        subArray = integerInput[ P[i] : Q[i] + 1 ]
        minimumValue = min(subArray)
        result[i] = minimumValue
    return result