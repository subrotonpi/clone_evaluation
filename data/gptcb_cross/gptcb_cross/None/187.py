def getName (value): 
    buffer = ""
    high, low = "", ""
    if len(value) < getPartDivider(): 
        high, low = "", value
    else: 
        index = len(value) - getPartDivider()
        high, low = value[:index], value[index:]
    highName = getHighProcessor().getName(high)
    lowName = getLowProcessor().getName(low)
    if highName != "":
        buffer = highName + SEPARATOR + getToken() 
        if lowName != "":
            buffer += SEPARATOR
    if lowName != "":
        buffer += lowName
    return buffer