def binary_search(int_to_search, sorted_array):
  lower = 0
  upper = len(sorted_array) - 1
  while lower <= upper:
    mid = lower + (upper - lower) // 2
    if int_to_search < sorted_array[mid]:
      upper = mid - 1
    elif int_to_search > sorted_array[mid]:
      lower = mid + 1
    else:
      return mid
  return -1