def getName(value):
    buffer = ''
    offset = -1
    num = 0
    if len(value) > 3:
        num = int(value[-3:], 10)
    else:
        num = int(value, 10)
    num = num % 100
    if num < 10:
        offset = (num % 10) - 1
    elif num < 20:
        offset = (num % 20) - 1
    if offset != -1 and offset < len(TOKENS):
        buffer = TOKENS [offset]
    return buffer