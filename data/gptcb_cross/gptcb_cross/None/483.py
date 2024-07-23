def getName(value):
    buffer = []
    high, low = ("", value) if len(value) < getPartDivider() else (value[: -getPartDivider()], value[-getPartDivider():])
    highName = getHighProcessor().getName(high)
    lowName  = getLowProcessor().getName(low)
    if highName != "":
        buffer.extend([highName, SEPARATOR, getToken()])
        if lowName != "":
            buffer.append(SEPARATOR)
    if lowName != "":
        buffer.append(lowName)
    return "".join(buffer)