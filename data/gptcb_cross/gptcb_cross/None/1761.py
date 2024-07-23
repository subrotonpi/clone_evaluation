def filter(self, source, start, end, dest, dstart, dend):
    out = super().filter(source, start, end, dest, dstart, dend)

    if out is not None:
        source = out
        start = 0
        end = len(out)

    length = end - start

    if length == 0:
        return source

    dest_len = len(dest)
    for index in range(dstart):
        if dest[index] == '.':
            if dest_len - (index + 1) + length > digits:
                return ''
            else:
                break

    for index in range(start, end):
        if source[index] == '.':
            if (dest_len - dend) + (end - (index + 1)) > digits:
                return ''
            else:
                break

    return source[start:end]