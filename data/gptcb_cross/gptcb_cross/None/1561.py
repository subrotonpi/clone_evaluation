def readNumber():
    x = -1
    while x < 0:
        print("Please enter a positive number.")
        try:
            x = int(input("Enter a number: "))
        except ValueError:
            pass
    return x