def mirrorView (node):
    if not node or (not node.left and not node.right):
        return node
    temp = node.left
    node.left = node.right
    node.right = temp
    mirrorView (node.left)
    mirrorView (node.right)
    return node