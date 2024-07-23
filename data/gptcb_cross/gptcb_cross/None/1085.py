def merge(*strings):
    sb = ""
    adv = 0
    edited = True
    while edited:
        edited = False
        for s in strings:
            if adv < len(s):
                sb += s[adv]
                edited = True
        adv += 1
    return sb