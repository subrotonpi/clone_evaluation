def binarySearch(intToSearch, sortedArray): 
    lower = 0
    upper = len(sortedArray) -1
    
    while lower <= upper:
        mid = lower + (upper - lower) // 2
        
        if intToSearch < sortedArray[mid]:
            upper = mid - 1
        elif intToSearch > sortedArray[mid]:
            lower = mid + 1
        else:
            return mid
    
    return -1