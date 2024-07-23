def run(): 
  try:
    print("Daemon Thread printing")
    time.sleep(10000)
  except Exception as e:
    pass
  finally:
    print("finally")