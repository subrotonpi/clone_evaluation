def bubbleSort(numArray):
    
    n = len(numArray)
    temp = 0
    
    for i in range(n):
        for j in range(1, (n-i)):
            if numArray[j-1] > numArray[j]:
                temp = numArray[j-1]
                numArray[j-1] = numArray[j]
                numArray[j] = temp