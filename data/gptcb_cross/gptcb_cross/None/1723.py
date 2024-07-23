def maxBlock(str): 
  maxCounter = 1
  counter = 1
  if len(str) == 0: 
    return 0
  
  for i in range(1, len(str)): 
    if str[i - 1] == str[i]: 
      counter += 1
    else: 
      if counter > maxCounter: 
        maxCounter = counter
      counter = 1
  
  return max(maxCounter, counter)