def solution(A):
  if len(A) == 2:
    return abs(A[0] - A[1])
  s1 = [A[0]] * (len(A) - 1)
  for i in range(1, len(A) - 1):
    s1[i] = s1[i - 1] + A[i]
  s2 = [A[len(A) - 1]] * (len(A) - 1)
  for i in range(len(A) - 3, -1, -1):
    s2[i] = s2[i + 1] + A[i + 1]
  final_sum = float('inf')
  for i in range(len(s1)):
    sum = abs(s1[i] - s2[i])
    if sum < final_sum:
      final_sum = sum
  return final_sum