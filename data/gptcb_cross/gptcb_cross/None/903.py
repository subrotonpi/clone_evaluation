def getLongestSubstring(s):
  if len(s) == 0:
    return None

  currentChar = s[0]
  longestString = "" + currentChar
  runningString = "" + currentChar
  currentLongestLength = 1

  for i in range(1, len(s)):
    if s[i] == currentChar:
      runningString = runningString + currentChar
      if len(runningString) > len(longestString):
        currentLongestLength += 1
        longestString = runningString
    else:
      runningString = "" + s[i]

  return longestString