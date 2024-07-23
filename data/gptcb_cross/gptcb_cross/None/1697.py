def hasLoop(root):
    if root is None:
        return False

    slow = root
    fast = root
    taken = 0
    limit = 2

    while fast.next is not None:
        fast = fast.next
        taken += 1
        if slow == fast:
            return True
        if taken == limit:
            taken = 0
            limit <<= 1
            slow = fast

    return False