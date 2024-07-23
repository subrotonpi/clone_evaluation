def sum13(nums):
  sum = 0
  for i in range (len(nums)):
    if nums[i] != 13:
      sum += nums[i]
    else:
      i += 1
  return sum