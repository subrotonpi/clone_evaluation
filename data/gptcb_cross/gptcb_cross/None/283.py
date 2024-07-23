def read():
    try:
        if currentFilePos <= 0 and currentBufferPos < 0 and currentLineReadPos < 0:
            return -1
        if not lineBuffered:
            fillLineBuffer()
        if lineBuffered:
            if currentLineReadPos == 0:
                lineBuffered = False
            return currentLine[currentLineReadPos - 1]
        return 0
    except IOException as e:
        print(e)