def longestSequenceOfChar(str): 
  interimresult = ""
  result = ""
  for i in range(len(str)):
    ch = str[i]
    interimresult += ch
    for j in range(i+1, len(str)):
      ch1 = str[j]
      if ch != ch1: 
        break 
      interimresult += ch
    if len(interimresult) > len(result): 
      result = interimresult
    interimresult = "" 
  return result