def join(objects, delimiter):
    if len(objects) == 0:
        return ""
    ret = objects[0]
    for i in range(len(objects)-1):
        ret += delimiter + objects[i+1]
    return ret