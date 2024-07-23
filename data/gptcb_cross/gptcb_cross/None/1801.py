def binarySearch(anArray, first,last, value):
    while first<=last:
        mid = (first+last)//2
        if value == anArray[mid]:
            return mid
        elif value < anArray[mid]:
            last = mid - 1
        else:
            first = mid + 1
    return -1