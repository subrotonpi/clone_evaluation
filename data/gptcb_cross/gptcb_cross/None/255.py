def findMIN(A, c):
    x = A[c] 
    position = c
    while c < len(A):
        if x > A[c]: 
            x = A[c] 
            position = c
        c += 1

    return position