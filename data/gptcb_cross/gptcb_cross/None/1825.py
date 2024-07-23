def main(): 
    large = [None] * 10 
    array = [33, 55, 13, 46, 87, 42, 10, 34, 43, 56]
    k = 0

    for i in range(len(array)):
        large[k] = max(array)
        k += 1
    
    print("Largest 5 is: " + str(large[:5])) # slicing large to get the first 5 elements
    
main()