def join(input, delimiter):
    sb = ""
    for value in input:
        sb = sb + value + delimiter
    length = len(sb)
    if length > 0:
        sb = sb[:-delimiter.length]
    return sb