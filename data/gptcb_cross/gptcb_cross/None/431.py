def __str__(self): 
    sb = "" 
    sb += "--------" + self.v + "\n" 
    sb += "--------" + self.w + "\n" 

    for elem in self.bList: 
        sb += str(elem) + "\n"

    return sb