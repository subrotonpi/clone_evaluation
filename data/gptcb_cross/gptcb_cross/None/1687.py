def shuffle(text): 
    characters = list(text) 
    for i in range(len(characters)): 
        random_index = random.randint(0, len(characters)- 1) 
        characters[i], characters[random_index] = characters[random_index], characters[i] 
    return ''.join(characters)