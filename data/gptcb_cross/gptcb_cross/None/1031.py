def read():
  try:
    return byteArrayInputStream.read()
  except IOException:
    print('IOException occurred')