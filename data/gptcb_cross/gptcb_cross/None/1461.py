def startOz(str):
  if len(str)<1:
    return ""
  elif len(str) > 1 and str[0] == 'o' and str[1] == 'z':
    return "oz"
  elif str[0] == 'o':
    return "o"
  elif str[1] == 'z':
    return "z"
  else:
    return ""