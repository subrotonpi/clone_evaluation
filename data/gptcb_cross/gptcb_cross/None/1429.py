def filter(source, start, end, dest, dstart, dend):
    out = super().filter(source, start, end, dest, dstart, dend)
    if out is not None:
        source = out
        start = 0
        end = len(out)
        
    length = end - start
    if length == 0:
        return source
    
    dest_length = len(dest)
    for i in range(0, dstart):
        if dest and dest[i] == '.':
            return "" if (dest_length - (i + 1) + length > digits) else source[start:end]
    
    for i in range(start, end):
        if source[i] == '.':
            return "" if (dest_length - dend + (end - (i + 1)) > digits) else source[start:end]
    
    return source[start:end]