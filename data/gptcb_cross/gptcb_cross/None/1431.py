def getName(value):
    buffer = ""
    offset = -1
    number = 0
    if len(value) > 3:
        number = int(value[-3:], 10)
    else:
        number = int(value, 10)
    number %= 100
    if number < 10:
        offset = (number % 10) - 1
    elif number < 20:
        offset = (number % 20) - 1
    if offset != -1 and offset < len(TOKENS):
        buffer += TOKENS[offset]
    return buffer