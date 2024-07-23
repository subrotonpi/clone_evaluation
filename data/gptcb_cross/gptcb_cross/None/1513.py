def print(*args): 
  for arg in args:
    if type(arg) == list: 
      print(str(arg))
    elif type(arg) == tuple: 
      print(str(arg))
    else:
      print(arg)