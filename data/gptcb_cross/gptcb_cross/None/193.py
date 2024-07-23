def type(text): 
  c = ''
  for ii in range(0, len(text)):
    c = text[ii]
    if (31 >= c <= 129):
      pressControlKey(c)
    else:
      typeAsciiCode(c)