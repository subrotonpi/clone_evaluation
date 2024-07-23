def filter(source, start, end, dest, dstart, dend):
        dot_pos = -1
        for i in range(len(dest)):
            if dest[i] == '.' or dest[i] == ',':
                dot_pos = i
                break
        if dot_pos >= 0:
            if source == '.' or source == ',':
                return ''
            if dend <= dot_pos:
                return None
            if len(dest) - dot_pos > decimalDigits:
                return ''
        return None