def run(sayThisManyTimes): 
  for i in range(sayThisManyTimes): 
    while not saidHello.get(): 
      pass
    print("World!")
    saidHello.set(False)