def read(self, cbuf, off, len):
    read = super().read(cbuf, off, len)
    if read == -1:
        return -1
    pos = off - 1
    for readPos in range(off, off + read):
        if cbuf[readPos] == '@':
            continue
        else:
            pos += 1
        if pos < readPos:
            cbuf[pos] = cbuf[readPos]
    return pos - off + 1