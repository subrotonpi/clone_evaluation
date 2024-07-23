def countZeros(f): 
  start = 0
  end = 0
  cnt = 0
  
  for i in range(1, len(f)): 
    if f[i-1] != 0 and f[i] == 0: 
      start = i 
    elif f[i-1] == 0 and f[i] != 0 and start > 0: 
      end = i 
      cnt += end-start 
  
  return cnt