for i in range (1, 16):
    s = ""
    if (i & 1) > 0:
        s += "A"
    if (i & 2) > 0:
        s += "B"
    if (i & 4) > 0:
        s += "C"
    if (i & 8) > 0:
        s += "D"
    print (s)
