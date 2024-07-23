def startOz(str):
    if len(str) >= 2 and str[0:2] == 'oz':
        return 'oz'
    elif len(str) >= 2 and str[1:2] == 'z':
        return 'z'
    elif len(str) >= 2 and str[0:1] == 'o':
        return 'o'
    else:
        return ''