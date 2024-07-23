def removeDuplicates(s):
  noDupes = []
  for i in s:
    if i not in noDupes:
      noDupes.append(i)
  return ''.join(noDupes)