def toHexString(bytes):
    if bytes is None:
        return None
    sb = ""
    for i in range(len(bytes)):
        high = (bytes[i] & 0xf0) >> 4
        low = bytes[i] & 0x0f
        sb += nibble2char(high)
        sb += nibble2char(low)
    return sb