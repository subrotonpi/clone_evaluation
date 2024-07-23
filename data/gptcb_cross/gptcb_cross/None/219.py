def read(self):
    if (self.currentFilePos <= 0 and self.currentBufferPos < 0 and self.currentLineReadPos < 0):
        return -1
    if not self.lineBuffered:
        self.fillLineBuffer()
    if self.lineBuffered:
        if (self.currentLineReadPos == 0):
            self.lineBuffered = False 
        return self.currentLine[self.currentLineReadPos--]
    return 0