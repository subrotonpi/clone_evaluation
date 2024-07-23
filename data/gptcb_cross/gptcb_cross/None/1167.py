def main():
    numOfItems = 20
    maxItems = 0
    arrayOfNames = [None] * numOfItems
    Temp = ""

    for i in range(len(arrayOfNames)):
        print("Enter Item {}:".format(i + 1))
        Temp = input()

        if Temp == arrayOfNames[0]:
            maxItems = i
            break
        else:
            arrayOfNames[i] = Temp
        
    for i in range(maxItems):
        print("Item #{}: {}".format(i + 1, arrayOfNames[i]))

if __name__ == '__main__':
    main()