def compress(text): 
  result = "" 
  index = 0
  while index < len(text): 
    c = text[index] 
    count = 0
    while index < len(text) and text[index] == c: 
      count += 1
      index += 1
    if count == 1: 
      result += c 
    else: 
      result += str(count) + c 
  return result