def getName(value):
    buffer = ""
    high = ""
    low = ""

    if (len(value) < getPartDivider()):
        high = ""
        low = value
    else:
        index = len(value) - getPartDivider()
        high = value[0:index]
        low = value[index:]
    
    highName = getHighProcessor().getName(high)
    lowName = getLowProcessor().getName(low)

    if (highName != ""):
        buffer += highName
        buffer += SEPARATOR
        buffer += getToken()

        if (lowName != ""):
            buffer += SEPARATOR
    
    if (lowName != ""):
        buffer += lowName

    return buffer