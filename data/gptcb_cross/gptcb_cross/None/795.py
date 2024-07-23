def secondMaxKey(self):
  if self.size() < 2:
    return None
  max = None
  max_2 = None
  second = self.first.next
  if self.first.key > second.key:
    max = self.first
    max_2 = second
  else:
    max = second
    max_2 = self.first
  x = second.next
  while x != None:
    if x.key > max.key:
      max_2 = max
      max = x
    elif x.key > max_2.key and x.key < max.key:
      max_2 = x
    x = x.next
  return max_2.key