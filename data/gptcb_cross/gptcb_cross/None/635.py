def put(key, value): 
    if key in map: 
        put(key, value)
        return
      
    while currentSize >= maxSize: 
        freeSpace()
        
    with self: 
        queue.add(key)
        map[key] = value
        currentSize += 1