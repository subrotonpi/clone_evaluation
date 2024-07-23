def solution (X, A):  
  sums = X * (X + 1) // 2
  valueSet = set ()
  numSum = 0
  for i in range (len (A)):
    if A [i] <= X and A [i] not in valueSet:
      numSum += A [i]
      if numSum == sums:
        return i
      valueSet.add (A [i])
  return -1