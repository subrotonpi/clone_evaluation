def join(separator, *values):
    if not values:
        return ""

    sep = list(separator)
    total_size = (len(values) - 1) * len(sep)
    for i in range(len(values)):
        if values[i] is None:
            values[i] = ""
        else:
            total_size += len(values[i])

    joined = [None] * total_size
    pos = 0

    for i in range(len(values) - 1):
        joined[pos : pos + len(values[i])] = list(values[i])
        pos += len(values[i])
        joined[pos : pos + len(sep)] = sep
        pos += len(sep)
    
    joined[pos : pos + len(values[len(values) - 1])] = list(values[len(values) - 1])
    return ''.join(joined)