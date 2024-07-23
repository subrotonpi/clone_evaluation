def zeroFront(nums): 
  if nums is None: 
    return None
  
  result = [0] * len(nums) 
  zeroPos, otherPos = 0, len(nums)-1
  
  for i in range(len(nums)): 
    if nums[i] == 0: 
      result[zeroPos] = 0
      zeroPos += 1
    else: 
      result[otherPos] = nums[i] 
      otherPos -= 1
  
  return result