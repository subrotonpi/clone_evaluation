def main():
    ch = input("Enter the Statement: ")
    count = 0
    len = 0
    while len != 1:
        try:
            name = list(ch)
            len = len(name)
            count = 0
            for j in range(0,  len):
                if ((name[0] == name[j]) and ((name[0] >= chr(65) and name[0] <= chr(91)) or (name[0] >= chr(97) and name[0] <= chr(123)))):
                    count += 1
            if (count != 0):
                print(name[0], count, "Times")
            ch = ch.replace(name[0], "")
        except Exception:
            pass

if __name__ == '__main__':
    main()