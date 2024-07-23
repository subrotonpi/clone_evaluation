def solution (X, A):
  lst = A
  s = 0
  searchedValue = X
  sumV = searchedValue * (searchedValue + 1)/2
  arrayList = []

  for iii in range(len(lst)):
    if lst[iii] <= searchedValue and lst[iii] not in arrayList:
      s += lst[iii]
      if s == sumV:
        return iii
      arrayList.append(lst[iii])

  return -1