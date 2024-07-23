def getString(): 
    msg = ""
    read = "init"
    while read.lower().startswith("hi"):
        read = inputGenerator.getMessage()
        msg = msg + read
    return msg