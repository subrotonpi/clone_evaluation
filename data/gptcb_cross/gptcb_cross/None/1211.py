def printSquare(min, max):
    for i in range(min, max+1):
        for j in range(i, max+1):
            print(j, end="")
        for k in range(min, i):
            print(k, end="")
        print()