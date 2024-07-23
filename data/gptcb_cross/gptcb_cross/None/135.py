def main():
    print("Main Method Started")
    size = int(input("Enter the size of the arr: "))
    max = int(input("Enter the maximum value of the arr: "))
    arr = initializeArr(max, size)
    print(arr)
    findMinMax(arr)
    print("Main Method Ended")