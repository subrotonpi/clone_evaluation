def getName(value):
    buffer = []
    tensFound = False
    if len(value) > 3:
        number = int(value[len(value)-3:], 10)
    else:
        number = int(value, 10)
    number %= 100
    if number >= 20:
        buffer.append(TOKENS[(number/10)-2])
        number %= 10
        tensFound = True
    else:
        number %= 20
    if number != 0:
        if tensFound:
            buffer.append(UNION_SEPARATOR)
        buffer.append(unitProcessor.getName(number))
    return ''.join(buffer)