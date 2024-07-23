def getName(value):
    buffer = []
    high, low = ''
    if len(value) < getPartDivider():
        high = ''
        low = value
    else:
        index = len(value) - getPartDivider()
        high = value[0:index]
        low = value[index:]
        
    highName = getHighProcessor().getName(high)
    lowName = getLowProcessor().getName(low)
    if highName != '':
        buffer.append(highName)
        buffer.append(SEPARATOR)
        buffer.append(getToken())
        if not lowName == '':
            buffer.append(SEPARATOR)
    
    if not lowName == '':
        buffer.append(lowName)
        
    return ''.join(buffer)