def join(separator, *values): 
  if (len(values) == 0): 
    return ""

  sep = list(separator) 
  totalSize = (len(values) - 1) * len(sep) 
  for i in range(len(values)): 
    if (values[i] == None): 
      values[i] = ""
    else:
      totalSize += len(values[i])  

  joined = [''] * totalSize 
  pos = 0 

  for i in range(len(values) - 1): 
    joined[pos:pos + len(values[i])] = list(values[i]) 
    pos += len(values[i]) 
    joined[pos:pos + len(sep)] = sep 
    pos += len(sep) 

  joined[pos:pos + len(values[len(values) - 1])] = list(values[len(values) - 1]) 
  return ''.join(joined)