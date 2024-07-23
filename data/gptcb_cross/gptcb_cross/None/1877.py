def sort(input): 
  for i in range(len(input)-1): 
    k = i+1
    nxtVal = input[k]
    while input[k-1] > nxtVal and k > 0:
      input[k] = input[k-1]
      k-=1
    input[k] = nxtVal
  print("Medium sorting is done and the result is:")
  print(list(input))