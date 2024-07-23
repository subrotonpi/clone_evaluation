def permute(level, prefix): 
  if level == 0: 
    print(prefix) 
    return
  for i in range(len(s)): 
     permute(level - 1, prefix + s[i])