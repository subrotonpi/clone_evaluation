def sort(input, startIndx, endIndx): 
  if startIndx >= endIndx: 
    return
  
  endIndexOrig = endIndx
  startIndexOrig = startIndx
  pivotVal = input[endIndx]
  
  while startIndx <= endIndx: 
    while input[startIndx] < pivotVal: 
      startIndx += 1
    while input[endIndx] > pivotVal: 
      endIndx -= 1
    
    if startIndx <= endIndx: 
      tmp = input[startIndex]
      input[startIndex] = input[endIndex]
      input[endIndex] = tmp
      
      startIndx += 1
      endIndx -= 1
      
  sort(input, startIndexOrig, endIndx)
  sort(input, startIndx, endIndexOrig)