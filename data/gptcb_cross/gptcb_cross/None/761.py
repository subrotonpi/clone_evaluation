def remove(element):
    n = head
    tmp = None
    while n != None and n.data != element:
        tmp = n
        n = n.previous
  
    if n is None:
        print("Element " + element + " not found.")
    else:
        tmp.prev = n.prev
        n.prev = None
        print("Element " + element + " removed.")