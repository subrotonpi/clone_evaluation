def solution (X, A):
    myHashSet = set ()
    for i in range (len (A)):
        if (A[i] <= X):
            myHashSet.add (A[i])
        if (len (myHashSet) == X):
            return i
    return - 1