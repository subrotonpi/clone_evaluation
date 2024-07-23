def toHexString(bytes):
    hexString = ''
    for i in bytes:
        hex = format(i, '02x')
        hexString += hex
    return hexString