def create_array(size):
    result = [0] * size
    limit = (size + 1) // 2
    start = 0
    value = 0
    idx = 0
    while idx < size:
        for i in range(start, start + limit):
            if idx >= size:
                break
            result[idx] = value
            idx += 1
        start += limit
        limit = (limit + 1) // 2
        value += 1
    return result