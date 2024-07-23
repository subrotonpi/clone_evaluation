def remove_duplicates(string):
    seen_chars = set()
    for char in string:
        if char in seen_chars:
            string = string.replace(char, '')
        else:
            seen_chars.add(char)
    return string