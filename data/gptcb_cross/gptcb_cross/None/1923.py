def countLines(str):
    if not str or not str.strip():
        return 0
    lines = 1
    pos = 0
    while str.find("\n", pos) + 1 != 0:
        lines += 1
        pos = str.find("\n", pos) + 1
    return lines