def run(): 
  for i in range(0, 11, 2): 
    with o:  
      while turn: 
        o.wait() 
      print(i)
      turn = not turn
      o.notify_all()