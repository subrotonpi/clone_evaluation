def output(fourLetter, fiveLetter, sixLetter):
    answer = ""
    count = 1
    lenfour = len(fourLetter)
    lenfive = len(fiveLetter)
    lensix = len(sixLetter)
    maximum = max(max(lenfour, lenfive), lensix)
    for i in range (maximum):
        if lensix > i:
            answer += sixLetter[i] + " "
        if lenfive > i: 
            answer += fiveLetter[i] + " "
        if lenfour > i:
            answer += fourLetter[i]
        answer += "\n"
        for j in range (count):
            answer += "\t"
        count += 1
    return answer