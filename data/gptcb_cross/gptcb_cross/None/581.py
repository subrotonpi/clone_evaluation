def search(A,K):
  l = 0 
  u = len(A) - 1 
  while (l <= u): 
    m = (u - l)//2 + l
    if A[m] < K: 
      l = m + 1 
    elif A[m] == K: 
      return m 
    else: 
      u = m - 1 
  return -1