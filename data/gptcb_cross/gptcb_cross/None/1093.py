def isAnagram(s1, s2):
    if len(s1) != len(s2):
        return False
    chars = [0] * 256
    for i in range(len(s1)): 
        c1 = ord(s1[i])
        c2 = ord(s2[i])
        chars[c1] += 1
        chars[c2] -= 1
    for char in chars: 
        if char != 0:
            return False 
    return True