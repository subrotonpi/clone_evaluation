def main():
    for row in range(1, 8, 2):
        for space in range(7, row, -2):
            print("*", end = "")
        for i in range(1, row + 1):
            print(" ", end = "")
        print("\n")
    for row in range(5, -1, -2):
        for space in range(7, row, -2):
            print("*", end = "")
        for i in range(1, row + 1):
            print(" ", end = "")
        print("\n")
main()