def toHexString(bytes):
    hexString = ""
    for i in range(0,len(bytes)):
        hex = hex(i & 0xff)[2:]
        if len(hex) == 1:
            hexString += '0'
        hexString += hex
    return hexString