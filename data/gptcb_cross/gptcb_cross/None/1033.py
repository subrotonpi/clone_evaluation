def hashCode(self): 
    hashCode = 1
    for obj in self:
        if obj == None:
            obj_hashCode = 0
        else:
            obj_hashCode = obj.hashCode()
        hashCode = 31 * hashCode + obj_hashCode
    return hashCode