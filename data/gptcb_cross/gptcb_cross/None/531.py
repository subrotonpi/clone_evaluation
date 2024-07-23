def interleave(you, me): 
  a = list(you) 
  b = list(me) 
  out = [] 
  maxLength = max(len(a), len(b)) 

  for i in range(maxLength): 
    if i < len(a): 
      out.append(a[i]) 
    if i < len(b): 
      out.append(b[i]) 

  return ''.join(out)