def makeStringsEqual(str, keyword):
    if len(str) > len(keyword):
        result = ""
        for i in range(len(str)):
            if str[i] != ' ':
                result += keyword[i % len(keyword)]
            else:
                result += ' '
    return result