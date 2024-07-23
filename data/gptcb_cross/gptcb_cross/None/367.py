def isAnagram(s1, s2):
    if len(s1) != len(s2):
        return False
    seen = [0] * 256
    s1 = s1.lower()
    s2 = s2.lower()
    for i in range(len(s1)):
        seen[ord(s1[i])] += 1
    for i in range(len(s2)):
        if seen[ord(s2[i])] == 0:
            return False
        seen[ord(s2[i])] -= 1
    for i in range(256):
        if seen[i] != 0:
            return False
    return True