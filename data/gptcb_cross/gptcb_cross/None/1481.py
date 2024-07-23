def isBinaryFile(f):
  try:
    type = os.path.probeContentType(f.toPath())
    if type is None: 
      return True
    elif type.startswith("text"):
      return False
    else: 
      return True
  except IOError:
    return False