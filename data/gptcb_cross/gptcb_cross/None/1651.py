def insertNodeAfter(nVal, curVal):
    prev = findPrevOf(curVal)
    curr = None
    if prev == None:
        curr = head
    else:
        curr = prev.getNext()
    newNode = Node(nVal)
    insert(curr, (curr if curr else curr.getNext()), newNode)