def type(text):
    for char in text:
        ascii_code = ord(char)
        if ascii_code <= 31 or ascii_code == 129:
            pressControlKey(char)
        else:
            typeAsciiCode(char)