def type (text):
    for char in text:
        if ord(char) <= 31 or ord(char) == 129:
            pressControlKey(char)
        else:
            typeAsciiCode(char)