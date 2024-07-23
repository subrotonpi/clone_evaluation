def getRows(i, j, array): 
  another = []
  while i <= j: 
    for k in range(len(array)-1): 
      another.append(array[i + k])
    i += 1
  return another