def front11(a, b):
    if a and b:
        return [a[0], b[0]]
    elif a:
        return [a[0]]
    elif b:
        return [b[0]]
    else:
        return []