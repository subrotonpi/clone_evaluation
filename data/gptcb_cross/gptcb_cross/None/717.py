def decrypt(s):
  crypt = []
  groups = s.split('#')
  for i in range(len(groups)):
    group = groups[i]
    j = 0
    if i == len(groups) - 1 and not s.endswith('#'):
      j = len(group)
    if len(group) > 2:
      j = len(group) - 2
    for k in range(j):
      crypt.append(int(group[k:k+1]))
    if j < len(group):
      crypt.append(int(group[j:len(group)]))

  n = ""
  for c in crypt:
    d = chr(97 + c - 1)
    n += d
  
  return n