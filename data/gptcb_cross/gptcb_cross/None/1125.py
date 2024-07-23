def copyFolder(src, dest):
  try:
      for s in os.listdir(src):
          d = os.path.join(dest, os.path.relpath(src, s))
          if os.path.isdir(s): 
              if not os.path.exists(d): os.mkdir(d)
          else:
              shutil.copy2(s, d)
  except Exception as ex:
      print(ex)