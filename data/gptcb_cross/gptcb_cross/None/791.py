def findArray (array, subArray):
    index = -1
    for i in range(len(array)):
        if array[i] == subArray[0]:
            for j in range(1, len(subArray)):
                if i + j > len(array) - 1 or array[i + j] != subArray[j]:
                    continue
            index = i
            break 
    return index