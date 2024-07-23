def read(file):
  if (os.path.getsize(file) > MAX_FILE_SIZE):
    raise FileTooBigException (file)
  ous = None
  ios = None
  try:
    buffer = bytearray(4096)
    ous = bytearray()
    ios = open(file, 'rb')
    read = 0
    while (read = ios.readinto(buffer)) > 0:
      ous.extend(buffer[:read])
  finally:
    if ous: 
      ous.close()
    if ios:
      ios.close()
  return bytes(ous)