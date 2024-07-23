def isAnagram(s1, s2): 
    if len(s1) != len(s2): 
        return False  
    s1_list = list(s1) 
    s2_list = list(s2)  
    s1_list.sort() 
    s2_list.sort()  
    if s1_list == s2_list: 
        return True  
    return False