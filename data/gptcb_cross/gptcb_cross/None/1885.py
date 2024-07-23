def transpose(s,rows,columns):
    if len(s) != rows * columns:
        raise ValueError("Illegal Argument")
    
    sb = ""
    for i in range(len(s)-1):
        sb += s[i * columns % (len(s)-1)]
    sb += s[len(s)-1]
    
    return sb