def MaxNumber(arr):
    Number_arr = [0] * 11       # Initializing array
    count = 1
    j = 0
    k = 0

    for i in range(len(arr)-1):
        if arr[i] == arr[i+1]:
            count+=1
        else:
            Number_arr[j] = count
            j+=1
            count = 1
    Number_arr[j] = count
    return Number_arr