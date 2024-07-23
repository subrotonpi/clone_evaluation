def remove(self): 
    if self.head is None:
        return None 
    val = self.head.value
    if self.head.next is None: 
        self.head = None
        self.tail = None
    else: 
        self.head = self.head.next
        self.head.prev = None
    return val