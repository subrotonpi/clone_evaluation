def removeDuplicates(arr):
    seen = set()
    i = 0
    while i < len(arr):
        if arr[i] in seen:
            arr.pop(i)
            i -= 1
        else:
            seen.add(arr[i])
        i += 1
    return arr