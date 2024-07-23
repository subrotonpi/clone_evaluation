def join(delimiter, *inStr):
    string_builder = ""
    if len(inStr) > 0:
        string_builder += inStr[0]
        for i in range(1, len(inStr)):
            string_builder += delimiter + inStr[i]
    return string_builder