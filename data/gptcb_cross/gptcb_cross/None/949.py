def filter(source, start, end, dest, dstart, dend):
    
    dot_pos = -1
    len_dest = len(dest)

    for i in range(len_dest):
        if dest[i] == '.' or dest[i] == ',':
            dot_pos = i
            break

    if dot_pos >= 0:
        if source == '.' or source == ',':
            return ""
        if dend <= dot_pos:
            return None
        if len_dest - dot_pos > decimal_digits:
            return ""

    return None