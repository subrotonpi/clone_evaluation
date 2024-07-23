def isImmutable(obj):
    objClass = obj.__class__
    superClass = objClass.__bases__[0]
    if superClass != Immutable:
        return False
    if not objClass.__dict__['__is_final__']:
        return False
    objFields = objClass.__dict__['__fields__']
    for field in objFields:
        if not field['__is_final__'] or not isValidFieldType(field['__type__']):
            return False
    return True