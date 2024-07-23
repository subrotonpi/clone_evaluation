def switchPairs(self):
    if self == None or self.next == None:
        return self
        
    top = self.next
    first = self
    second = first.next
    
    while first != None and second != None:
        third = second.next
        second.next = first
        first.next = third
        first = third
        
        if first != None:
            second.next.next = first.next
            second = first.next
            
    return top