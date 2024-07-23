def filter(source, start, end, dest, dstart, dend):
  ls_start = ""
  ls_insert = ""
  ls_end = ""
  ls_text = ""

  print("debug: ", mo_pattern)
  print("debug: source: ", source, "start: ", start, "end: ", end, "dest: ", dest, "dstart: ", dstart, "dend: ", dend)

  ls_text = dest.toString()
  if(len(ls_text) > 0):
    ls_start = ls_text[0:dstart]
    print("debug: ls_start: ", ls_start)
    if (source != ""):
      ls_insert = source.toString()
      print("debug: ls_insert: ", ls_insert)
    ls_end = ls_text[dend:]
    print("debug: ls_end: ", ls_end)
    ls_text = ls_start + ls_insert + ls_end
    print("debug: ls_text: ", ls_text)

  lo_matcher = mo_pattern.matchter(ls_text)
  print("debug: lo_matcher.match: ", lo_matcher.matches(), "ls_text: ", ls_text)
  if(lo_matcher.matches() != True):
    return ""
  return None