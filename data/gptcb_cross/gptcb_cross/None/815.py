def compressBad(str):
    countConsecutive = 0
    compressedString = ""
    for i in range(len(str)):
        countConsecutive += 1
        if len(str) == (i + 1):
            compressedString += '' + str[i] + str(countConsecutive)
            countConsecutive = 0
            break
        elif str[i] != str[i+1]:
            compressedString += '' + str[i] + str(countConsecutive)
            countConsecutive = 0
    return compressedString