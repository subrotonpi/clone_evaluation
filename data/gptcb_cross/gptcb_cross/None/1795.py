def isAnagram(s1,s2):
    if len(s1)!=len(s2):
        return False
    s1 = s1.lower()
    s2 = s2.lower()
    chars = dict()
    for i in range(len(s1)):
        if s1[i] in chars.keys():
            chars[s1[i]] += 1
        else:
            chars[s1[i]] = 1
        if s2[i] in chars.keys():
            chars[s2[i]] -= 1
        else:
            chars[s2[i]] = -1
    for key in chars:
        if chars[key] != 0:
            return False
        return True