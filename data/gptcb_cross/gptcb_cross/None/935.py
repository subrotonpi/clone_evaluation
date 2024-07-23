def getName(value):
    buffer = ''
    tensFound = False
    number = 0
    if len(value) > 3:
       number = int(value[-3:],10)
    else: 
        number = int(value, 10)
    number %= 100

    if number >= 20:
        buffer += TOKENS[(number//10)-2]
        number %= 10
        tensFound = True
    else:
        number%=20

    if number != 0:
        if tensFound:
            buffer+= UNION_SEPARATOR
        buffer += unitProcessor.getName(number)
    return buffer