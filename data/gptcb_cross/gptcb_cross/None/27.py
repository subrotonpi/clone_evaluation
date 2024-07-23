def contains(a, b):
    mapA = dict()
    mapB = dict()
    for char in a:
       val = mapA.get(char)
       if val == None: 
            mapA[char] = 1
       else:
            mapA[char] += 1
    for char in b:
       val = mapB.get(char)
       if val == None: 
            mapB[char] = 1
       else:
            mapB[char] += 1
    for key, val in mapA.items():
        if mapB.get(key) == None or mapA[key] > mapB[key]:
            return False
    return True