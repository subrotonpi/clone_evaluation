def findMinMax(arr):
    max = - float('inf')
    min = float('inf')
    for num in arr:
        if num > max:
            max = num
        elif num < min:
            min = num
    return (min, max)
def main():
    arr_len = int(input("Enter the number of elements: "))
    arr = [int(input("Enter the elements:")) for i in range(arr_len)]
    min, max = findMinMax(arr)
    print("Smallest Value in array:", min)
    print("Highest Value in array:", max)

if __name__ == "__main__":
    main()