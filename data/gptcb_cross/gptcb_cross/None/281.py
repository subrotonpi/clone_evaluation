def inOrder (m_root):
    if m_root is None:
        return
    myStack = []
    current = m_root
    while current is not None:
        myStack.append (current)
        current = current.getLeft ()
    while len(myStack) > 0:
        current = myStack.pop ()
        print (current.getInfo (), " ")
        if current.getRight () is not None:
            current = current.getRight ()
            while current is not None:
                myStack.append (current)
                current = current.getLeft ()