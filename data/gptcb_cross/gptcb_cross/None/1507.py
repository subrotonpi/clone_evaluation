def getRandomNumberBetween(numberOne, numberTwo):
    if (numberOne == numberTwo):
        raise Exception ("Both the numbers cannot be equal")
    rand = random.random()
    highRange = max(numberOne, numberTwo)
    lowRange = min(numberOne, numberTwo)
    lowRand = math.floor(rand - 1)
    highRand = math.ceil(rand + 1)
    genRand = (highRange - lowRange) * ((rand - lowRand) / (highRand - lowRand)) + lowRange
    return genRand