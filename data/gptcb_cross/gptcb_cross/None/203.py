def countClamps (arr): 
    result = 0
    prev = 0
    same = False
    for i in range(len(arr)): 
        if i == 0: 
            prev = arr[i]
        else: 
            if arr[i] == prev:
                if not same:
                    result += 1
                    same = True
            else: 
                prev = arr[i]
                same = False
    return result