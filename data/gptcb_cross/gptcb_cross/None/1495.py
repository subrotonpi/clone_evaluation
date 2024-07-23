def hasLoop(root):
  if (root == None):
    return False
  slow = root
  fast = root
  taken = 0
  limit = 2
  while fast.next != None:
    fast = fast.next
    taken += 1
    if slow == fast:
      return True
    if taken == limit:
      taken = 0
      limit = limit << 1
      slow = fast
  return False