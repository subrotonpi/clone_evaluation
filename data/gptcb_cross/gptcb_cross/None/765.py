def toHexString (bytes):
    hexString = ""
    for i in range(len(bytes)):
        hex = format(bytes[i], '02x')
        hexString += hex
    return hexString