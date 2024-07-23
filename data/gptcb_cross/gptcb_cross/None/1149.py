def reverse(toBeNextNode, currentNode):
    currentHead = currentNode

    if currentNode == None or currentNode.next == None and toBeNextNode == None:
        return currentHead
    if currentNode.next != None:
        currentHead = reverse(currentNode,currentNode.next)
    currentNode.next = toBeNextNode
    return currentHead