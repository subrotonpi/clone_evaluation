def findCommonElements(collections):
    arr1 = collections[0]
    arr2 = collections[1]
    arr3 = collections[2]

    if arr1.length < arr2.length and arr1.length < arr3.length or arr2.length <= arr3.length:
        hash_array = arr1
        query_array = arr2 + arr3
    elif arr2.length < arr1.length and arr2.length < arr3.length or arr1.length <= arr3.length:
        hash_array = arr2
        query_array = arr1 + arr3
    elif arr3.length < arr1.length and arr3.length < arr2.length or arr1.length <= arr2.length:
        hash_array = arr3
        query_array = arr1 +arr2

    intersection_set = set()
    array_to_hash = set()

    for element in hash_array:
        array_to_hash.add(element)

    for element in query_array:
        if element != None:
            comparisons += 1
        if element in array_to_hash:
            intersection_set.add(element)

    return list(intersection_set)