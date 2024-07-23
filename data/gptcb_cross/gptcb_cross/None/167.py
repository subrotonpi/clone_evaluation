def contains(a,b): 
  diff = len(a) - len(b) 
  while len(a) > 0: 
    b=b.replace(a[0],"") 
    a=a.replace(a[0],"") 
    if(diff!=len(a) - len(b)): return False 
  return True