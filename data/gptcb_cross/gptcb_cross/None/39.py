def type(text):
    c = ""
    for ii in range(len(text)):
        c = text[ii]
        if c <= 31 or c == 129:
            pressControlKey(c)
        else:
            typeAsciiCode(c)