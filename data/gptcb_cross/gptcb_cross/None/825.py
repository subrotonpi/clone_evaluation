def filter(source, start, end, dest, dstart, dend):
    replc = source[start:end]
    newVal = dest[:dstart] + replc + dest[dend:end]
    matcher = mPattern.match(newVal)
    if matcher:
        return None
    if source == '':
        return dest[dstart:dend]
    else:
        return ''