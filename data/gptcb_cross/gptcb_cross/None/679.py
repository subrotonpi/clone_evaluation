def longerTF(guess): 
    variableTrue = 0
    variableFalse = 0
    for x in range(len(guess)):
        if (guess[x]):
            variableTrue += 1
        else: 
            variableFalse += 1
    return variableTrue >= variableFalse