def addString(*myString): 
    separator = " AND "
    sb = "("
    needSeparator = False
    for string in myString:
        if needSeparator:
            sb += separator
        else:
            needSeparator = True
        sb += string
    sb += ")"
    print(sb)