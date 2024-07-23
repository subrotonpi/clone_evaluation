def expandAllNodes (tree):
    j = tree.getRowCount ()
    i = 0
    while i < j:
        tree.expandRow (i)
        i += 1
        j = tree.getRowCount ()