def reverse(n, p):
    if n is None:
        return None
    if n.next is None:
        n.next = p
        return n
    r = reverse(n.next, n)
    n.next = p
    return r