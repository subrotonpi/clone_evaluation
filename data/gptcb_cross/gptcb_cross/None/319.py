def solution(X, A):
  counter = [0] * (X + 1)
  ans = -1
  x = 0
  for i in range(len(A)):
    if counter[A[i]] == 0:
      counter[A[i]] = A[i]
      x += 1
      if x == X:
        return i
   
  return ans