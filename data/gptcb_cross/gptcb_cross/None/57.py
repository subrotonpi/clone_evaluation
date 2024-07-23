def remove_duplicates (arr):
    end = len(arr)
    for i in range(0, end):
        for j in range(i + 1, end):
            if arr[i] == arr[j]:
                arr[j] = arr[end - 1]
                end -= 1
                j -= 1
    whitelist = [0] * end
    whitelist = arr[0:end]
    return whitelist