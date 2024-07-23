def main():
    numOfItems = 0
    print("Enter How Many Items: ")
    try:
        numOfItems = int(input().strip())
    except ValueError:
        print("Number of items you entered is invalid!")
        sys.exit(0)
        
    grocery = Grocery(numOfItems)
    for x in range(numOfItems):
        print("Enter Item " + str(x + 1) + " : ")
        if not grocery.addItem(input()):
            print("First Item Duplicate Detected!")
            sys.exit(0)

    print(str(grocery))