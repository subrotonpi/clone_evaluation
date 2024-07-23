def addFluid(): 
  alreadyAnswered1 = False
  alreadyAnswered2 = False
  alreadyAnswered3 = False
  while True:
    try:
      if not alreadyAnswered1:
        f.setFluidID(input("Please enter fluid's ID: "))
        alreadyAnswered1 = True
      if not alreadyAnswered2:
        f.setMolecularWeight(float(input("Please enter fluid's molecular weight: ")))
        alreadyAnswered2 = True
      if not alreadyAnswered3:
        f.setTemperature(float(input("Please enter fluid's temperature: ")))
        alreadyAnswered3 = True
      error = False
      break
    except ValueError:
      print("Error! Please provide the right input.")
  getFluid().add(f)
  print(getFluid())
  return f