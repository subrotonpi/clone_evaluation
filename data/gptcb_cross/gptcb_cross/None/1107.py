def sequenceNums (nums):
  sb = ""
  rangeStart = nums [0]
  previous = nums [0]
  current = 0
  expected = previous + 1
  for i in range(1, len(nums)):
    current = nums[i]
    expected = previous + 1
    if (i == len(nums) - 1) and (current != expected):
      sb += f"{rangeStart}-{current}"
    elif (current != expected):
      if (rangeStart != previous):
        sb += f"{rangeStart}-{previous},"
      else:
        sb += f"{rangeStart},"
      rangeStart = current
    else:
      previous = current
  if (sb[-1] == ','):
    sb = sb[:-1]

  return sb.toString ()