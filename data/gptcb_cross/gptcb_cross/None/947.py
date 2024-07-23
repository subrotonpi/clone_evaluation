def put(key, val):
    if key in map:
        map[key] = val
        return
    while currentSize >= maxSize:
        freeSpace() 
    with lock: 
        queue.add(key)
        map[key] = val
        currentSize += 1