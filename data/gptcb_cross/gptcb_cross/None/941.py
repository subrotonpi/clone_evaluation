def investigate(p, *type_args):
    c = p.getRawType()
    b = str(c.getName()) + '<'
    local_args = p.getActualTypeArguments()
    if type_args and len(type_args) > 0:
        for i in range(0, len(local_args)):
            if isinstance(local_args[i], ParameterizedType):
                local_p = local_args[i]
                b += str(local_p.getRawType()) + '<'
                b += type_args[i]
                b += '>'
            elif isinstance(local_args[i], TypeVariable):
                local_args[i] = type_args[i]
                b += local_args[i]
            else:
                b += str(local_args[i])
            b += ', '
        if len(type_args) > 0:
            b = b[:-2]
        b += '>'
    else:
        args = str(local_args)
        b += args[1:-1] + '>'
    print(b)
    investigate(c, local_args)