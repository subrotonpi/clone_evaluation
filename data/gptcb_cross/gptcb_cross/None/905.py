def isAnagram(first, second):
    positive = first.lower()
    negative = second.lower()

    if len(positive) != len(negative):
        return False
    
    counter = [0] * 26

    diff = 0
    for i in range(len(positive)):
        pos = ord(positive[i]) - 97
        if counter[pos] >= 0:
            diff += 1
        else:
            diff -= 1
        counter[pos] += 1

        neg = ord(negative[i]) - 97
        if counter[neg] <= 0:
            diff += 1
        else:
            diff -= 1
        counter[neg] -= 1

    if diff == 0:
        return True
    else:
        return False