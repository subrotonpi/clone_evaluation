def getName(value): 
    buffer = ""
    number = 0
    if (value == ""): 
        number = 0
    elif (len(value) > 4): 
        number = int(value[len(value)-4:], 10)
    else: 
        number = int(value, 10)
        
    number %= 1000
    if (number >= 100): 
        buffer += unitProcessor.getName(int(number/100)) + SEPARATOR
        buffer += SCALE.getName(EXPONENT)
        
    tensName = tensProcessor.getName(number % 100)
    if (tensName != "" and number >= 100): 
        buffer += SEPARATOR
    buffer += tensName
          
    return buffer