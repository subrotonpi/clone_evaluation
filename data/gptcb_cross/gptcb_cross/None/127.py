def score(a, b, idxA, idxB):
    value = 0
    if idxA < len(a) and idxB < len(b):
        if a[idxA] == b[idxB]:
            value = 1 + score(a, b, idxA + 1, idxB + 1) 
        else:
            x = score(a,b, idxA + 1, idxB)
            y = score(a,b, idxA, idxB + 1)
            value = max(x, y)
    return value