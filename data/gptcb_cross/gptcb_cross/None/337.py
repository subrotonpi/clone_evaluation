def capitalizer(word):
    words = word.split(" ")
    sb = ''
    if len(words[0]):
        sb += words[0][0].upper() + words[0][1:].lower()
        for i in range(1, len(words)):
            sb += " " + words[i][0].upper() + words[i][1:].lower()
    return sb