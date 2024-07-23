def printArray(arr):
  print('[', end = '')
  for i in range(len(arr)):
    if i == len(arr)-1:
      print(arr[i], end = '')
    else:
      print(arr[i], end = ', ')
  print(']')