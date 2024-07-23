for row in range(1, 8, 2):
    for space in range(7, row-1, -2):
        print("*", end="")
    for i in range(row):
        print(" ", end="")
    print()
for row in range(5, 0, -2):
    for space in range(7, row-1, -2):
        print("*", end="")
    for i in range(row):
        print(" ", end="")
    print()
