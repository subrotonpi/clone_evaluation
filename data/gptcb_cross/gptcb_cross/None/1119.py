def get(self, i): 
  if i < 0: 
    raise IndexError("Index is negative!") 
  elif i == 0: 
    return self
  elif self.next is not None:
     return self.next.get(i - 1) 
  else: 
    raise IndexError("Index exceeds bounds")