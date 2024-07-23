def singleNumber(arr): 
    ans = 0
    seen = []
    for i in range(len(arr)): 
        if arr[i] not in seen: 
            seen.append(arr[i]) 
        else: 
            ans = arr[i] 
            break
    return ans