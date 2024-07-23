def isAnagram(s1, s2):
    if len(s1) != len(s2):
        return False

    s1 = s1.lower()
    s2 = s2.lower()
    c1 = list(s1)
    c2 = list(s2)

    c1.sort()
    c2.sort()

    sc1 = "".join(c1)
    sc2 = "".join(c2)

    return sc1 == sc2