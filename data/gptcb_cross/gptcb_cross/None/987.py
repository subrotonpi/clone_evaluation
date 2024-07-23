def solution(X, A):
  empty_position = set(range(1, X+1))
  for i, element in enumerate(A):
    if element in empty_position: 
      empty_position.remove(element)
    if len(empty_position) == 0:
      return i
  return -1