def shuffle(text): 
  characters = list(text) 
  for i in range(len(characters)): 
    randomIndex = int(random.random() * len(characters)) 
    temp = characters[i] 
    characters[i] = characters[randomIndex] 
    characters[randomIndex] = temp 
  return ''.join(characters)