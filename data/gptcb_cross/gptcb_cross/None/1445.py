def center(s, size, pad):
  if s is None or size <= len(s): 
    return s

  result = []
  for i in range((size - len(s)) // 2): 
    result.append(pad)
  result.append(s)

  while(len(result) < size):
    result.append(pad)

  return "".join(result)