def toString(obj):
    if obj == None:
        return "null"
    if obj in visited:
        return "..."
    visited.append(obj)
    cl = type(obj)
    if cl == str:
        return obj
    if cl.__name__ == 'list' or cl.__name__ == 'tuple':
        r = ''
        for i in range(len(obj)):
            if r != '':
                r += ','
            if type(obj[i]).__name__ in ['int', 'float', 'str']:
                r += str(obj[i])
            else:
                r += toString(obj[i])
        return cl.__name__ + "[]{" + r + "}"
    r = cl.__name__
    while cl:
        r += "["
        fields = list(cl.__dict__.keys())
        for f in fields:
            if f[:2] != '__':
                if r[-1] != '[':
                    r += ','
                r += f + "="
                t = type(cl.__dict__[f])
                val = cl.__dict__[f]
                if t.__name__ in ['int', 'float', 'str']:
                    r += str(val)
                else:
                    r += toString(val)
        r += "]"
        cl = cl.__base__
    return r