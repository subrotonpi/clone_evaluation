def contains(a,b):
    status = True
    mapA = {}
    mapB = {}
    
    for char in a:
        val = mapA.get(char)
        if val != None:
            mapA[char] = val + 1
        else:
            mapA[char] = 1
    
    for char in b:
        val = mapB.get(char)
        if val != None:
            mapB[char] = val + 1
        else:
            mapB[char] = 1
    
    for entry in mapA.items():
        if mapB.get(entry[0]) == None or entry[1] > mapB.get(entry[0]):
            status = False

    return status