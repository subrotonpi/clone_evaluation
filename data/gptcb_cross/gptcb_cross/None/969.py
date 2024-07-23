def isAnagram(s1, s2):
    if len(s1) != len(s2):
        return False
    for i in range(len(s2)):
        if s2[i] not in s1:
            return False
        s1 = s1.replace(s2[i], "", 1)
        s2 = s2.replace(s2[i], "", 1)
    return True