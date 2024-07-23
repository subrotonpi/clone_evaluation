def capitalize(s):
    if (s is None or len(s) == 0):
        return ""
    first = s[0]
    if (first.isupper()):
        return s
    else:
        return first.upper() + s[1:]