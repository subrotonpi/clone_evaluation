def read(in):
    if in.isJsonArray():
        list_ = []
        arr = in.getAsJsonArray()
        for anArr in arr:
            list_.append(read(anArr))
        return list_
    elif in.isJsonObject():
        map_ = {}
        obj = in.getAsJsonObject()
        entitySet = obj.entrySet()
        for entry in entitySet:
            map_[entry.getKey()] = read(entry.getValue())
        return map_
    elif in.isJsonPrimitive():
        prim = in.getAsJsonPrimitive()
        if prim.isBoolean():
            return prim.getAsBoolean()
        elif prim.isString():
            return prim.getAsString()
        elif prim.isNumber():
            num = prim.getAsNumber()
            if math.ceil(num.doubleValue()) == num.longValue():
                return num.longValue()
            else:
                return num.doubleValue()
    return None