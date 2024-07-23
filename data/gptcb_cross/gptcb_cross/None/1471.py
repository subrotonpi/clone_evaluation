def accept(pathname):
  if os.path.isdir(pathname):
    for f in os.listdir(pathname):
      accept(os.path.join(pathname,f))
    os.rmdir(pathname)
  else:
    os.remove(pathname)
  return False