def solution(N):  
  binaryStr = bin(N)[2:] 
  zeroArrays = binaryStr.split('1')
  gap = 0
  for zeroArray in zeroArrays: 
    gap = len(zeroArray) if len(zeroArray) > gap else gap
  return gap