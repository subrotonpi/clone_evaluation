def toString(self):
    sb = ""
    sb+= str(self.a) + "\n"
    sb+= str(self.b) + "\n"
    for elem in self.aList:
        sb+= str(elem) + "\n"
    return sb