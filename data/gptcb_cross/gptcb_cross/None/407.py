def isAnagram(s1, s2):
    if len(s1) != len(s2):
        return False
    arr1 = sorted(list(s1))
    arr2 = sorted(list(s2))
    return arr1 == arr2