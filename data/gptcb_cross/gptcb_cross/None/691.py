while True:
    i = input("Type in any integer: ")
    if not i.isdigit():
        print("Not a number")
    else:
        num = int(i)
        if num != 0:
            if num % 2 == 0:
                print(str(num) + " is even")
            else:
                print(str(num) + " is odd")
        else:
            print("Zeros are not allowed, bye!")
            break
