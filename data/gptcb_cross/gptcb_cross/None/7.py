def find_first_character(string): 
    unique = set() 
    seen = set() 
    
    for c in string: 
        if c not in seen: 
            unique.add(c) 
            seen.add(c) 
        else: 
            unique.discard(c)
            
    if not unique: 
        return '_'
    else:
        return unique.pop()