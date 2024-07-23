def removeDuplicates(s):
  no_dupes = ""
  for i in s:
    if i not in no_dupes:
      no_dupes += i
  return no_dupes