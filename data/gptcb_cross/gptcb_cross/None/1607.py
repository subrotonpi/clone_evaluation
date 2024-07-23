def main():
    scan = input()
    numOfItems = 0
    print("Enter How Many Items: ")
    try:
        numOfItems = int(scan)
    except ValueError as e:
        print ("Number of items you entered is invalid!")
        exit(0)

    grocery = Grocery(numOfItems)
    for i in range(numOfItems):
        print ("Enter Item " + str(i + 1) + " : ")
        if not grocery.addItem(input()):
            print ("First Item Duplicate Detected!")
            exit(0)
    print (grocery.toString ())