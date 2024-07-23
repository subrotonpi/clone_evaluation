def startOz(str):
  len = len(str)
  if len < 1:
    return ""
    
  if len > 1 and str[0] == "o" and str[1] == "z":
    return "oz"
    
  if str[0] == "o":
    return "o"
    
  if str[1] == "z":
    return "z"
    
  return ""