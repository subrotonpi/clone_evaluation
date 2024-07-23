def read():
    try:
        if currentPos < currentLineEnd:
            in.seek(currentPos++)
            readByte = in.readByte() 
            return readByte 
        elif currentPos > lastPosInFile and currentLineStart < currentLineEnd:
            findPrevLine()
            if lastChar != '\n' and lastChar != '\r':
                return '\n'
            else:
                return read()
        elif currentPos < 0:
            return -1
        else:
            findPrevLine()
            return read()
    except IOException as e:
        print(e)