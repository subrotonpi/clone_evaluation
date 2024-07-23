def isPermutation(a, b):
  aArray = list(a)
  bArray = list(b)
  if len(a) != len(b):
    return False
  found = 0
  for i in range(len(aArray)):
    eachA = aArray[i]
    for k in range(len(bArray)):
      if eachA == bArray[k]:
        found += 1
        bArray[k] = ''
        break
  return found == len(aArray)