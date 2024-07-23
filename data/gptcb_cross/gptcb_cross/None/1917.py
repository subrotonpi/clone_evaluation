def isAnagram(first, second): 
    positive = first.lower() 
    negative = second.lower() 
    if(len(positive) != len(negative)): 
        return False
    counts = [0] * 26
    diff = 0
    for i in range(len(positive)): 
        pos= ord(positive[i]) - 97
        if(counts[pos] >= 0): 
            diff += 1
        else: 
            diff -= 1
        counts[pos] += 1
        neg = ord(negative[i]) - 97
        if(counts[neg] <= 0): 
            diff += 1
        else: 
            diff -=1
        counts[neg] -= 1

    return diff == 0