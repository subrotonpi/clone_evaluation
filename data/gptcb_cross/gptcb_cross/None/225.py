def getName(value):
    buffer = []
    high, low = ("", value) if len(value) < getPartDivider() else (value[:len(value)-getPartDivider()], value[-getPartDivider():])
    highName = getHighProcessor().getName(high)
    lowName = getLowProcessor().getName(low)
    if highName != "":
        buffer.append(highName)
        buffer.append(SEPARATOR)
        buffer.append(getToken())
        if lowName != "":
            buffer.append(SEPARATOR)
    if lowName != "":
        buffer.append(lowName)
    return "".join(buffer)