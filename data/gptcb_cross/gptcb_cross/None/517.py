def remove(key):
    with lock:
        item = cache.remove(key)
        if item is not None:
            return item.payload
        else:
            return None