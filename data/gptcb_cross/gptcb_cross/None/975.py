def isNumber(str):
  i = 0
  len = len(str)
  a = False
  b = False
  c = False
  d = False
  if i < len and (str[i] == '+' or str[i] == '-'):
    i += 1
  while i < len and str[i].isdigit():
    i += 1
    a = True
  if i < len and str[i] == '.':
    i += 1
  while i < len and str[i].isdigit():
    i += 1
    b = True
  if i < len and (str[i] == 'e' or str[i] == 'E') and (a or b):
    i += 1
    c = True
  if i < len and (str[i] == '+' or str[i] == '-') and c:
    i += 1
  while i < len and str[i].isdigit():
    i += 1
    d = True
  return i == len and (a or b) and (not c or (c and d))