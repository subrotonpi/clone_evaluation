def encrypt(data): 
    returned = '' 
    code_dict = {
        'a': 'c', 'b': 'd', 'c': 'e', 'd': 'f', 'e': 'g', 
        'f': 'h', 'g': 'i', 'h': 'j', 'i': 'k', 'j': 'l', 
        'k': 'm', 'l': 'n', 'm': 'o', 'n': 'p', 'o': 'q', 
        'p': 'r', 'q': 's', 'r': 't', 's': 'u', 't': 'v', 
        'u': 'w', 'v': 'x', 'w': 'y', 'x': 'z', 'y': 'a', 
        'z': 'b' 
    }
    for char in data:
        returned += code_dict[char] 
    return returned