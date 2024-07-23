def remove(): 
    if not head: 
        return None
    val = head.value
    if head.next is None: 
        head = None
        tail = None
    else: 
        head = head.next
        head.prev = None
    return val