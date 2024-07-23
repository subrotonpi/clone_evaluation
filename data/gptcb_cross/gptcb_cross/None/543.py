def isAnagram(s1, s2):
    if len(s1) != len(s2):
        return False
    
    charMap = [0] * 256
    
    for i in range(len(s1)):
        charMap[ord(s1[i])] += 1
        charMap[ord(s2[i])] -= 1
    
    for x in charMap:
        if x != 0:
            return False
    
    return True