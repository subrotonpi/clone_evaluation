def solution(X, A):
  size = len(A)
  check = [0]*X
  cmp = 0
  time = -1
  for x in range(0, size):
    temp = A[x]
    if temp <= X:
      if check[temp-1] > 0:
        continue
      check[temp-1] += 1
      cmp += 1

    if cmp == X:
      time = x
      break
  return time