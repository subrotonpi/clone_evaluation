def validName(input, histogram): 
  user = "" 
  name = input.read() 
  if histogram.search(name) != None:  
    print("This name exist") 
  else: 
    print("Name not found") 
    user = validName(input, histogram) 
  return user