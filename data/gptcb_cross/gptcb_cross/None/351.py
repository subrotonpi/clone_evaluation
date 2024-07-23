def read():
  try:
    return bais.read()
  except IOException:
    return -1