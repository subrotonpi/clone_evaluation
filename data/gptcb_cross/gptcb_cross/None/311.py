def get(self, *keys):
  if keys is None:
    return self.value
  if self.expectedNumberOfKeys == -1:
    return None
  if self.expectedNumberOfKeys == 0:
    return self.value
  if self.expectedNumberOfKeys != len(keys):
    raise IllegalArgumentException("Expecting " + str(self.expectedNumberOfKeys) + " keys. Was " + str(len(keys)))
    
  currentMap = self.topMap
  for i in range(len(keys)-1):
    currentMap = self._getDefault(currentMap, keys[i])
    
  result = self._getDefault(currentMap, keys[len(keys)-1])
  return result