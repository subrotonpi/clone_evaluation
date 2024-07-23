def isBalanced(str): 
  if len(str) < 2: 
    return False 

  result = False  
  stack = []  
  
  for i in range(len(str)): 
    char = str[i] 
    if char not in parenthesesMapRight and char not in parenthesesMapLeft: 
      continue
    
    if char in parenthesesMapLeft: 
      stack.append(char) 
    else: 
      if not len(stack) == 0 and stack.pop() == parenthesesMapRight[char]: 
        result = True 
      else: 
        return False 
    
  if len(stack) != 0: 
    return result = False 
  return result