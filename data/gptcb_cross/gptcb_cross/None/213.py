def zeroFront(nums):
  if nums is None:
    return None
  
  zeros_pos = 0
  
  for i in range(len(nums)):
    if nums[i] == 0:
      nums[i], nums[zeros_pos] = nums[zeros_pos], nums[i]
      zeros_pos += 1
      
  return nums