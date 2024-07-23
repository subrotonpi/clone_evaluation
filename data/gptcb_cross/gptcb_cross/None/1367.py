def getName(value):
  negative = False
  if value.startswith("-"):
    negative = True
    value = value[1:]

  decimals = value.index(".")
  decimalValue = None
  if 0 <= decimals:
    decimalValue = value[decimals+1:]
    value = value[:decimals]

  name = processor.getName(value)
  if name == "":
    name = ZERO_TOKEN
  elif negative:
    name = 'minus ' + SEPARATOR + name

  if decimalValue != None and decimalValue != "":
    zeroDecimalValue = ""
    for i in range(len(decimalValue)):
      zeroDecimalValue += "0"

    if decimalValue == zeroDecimalValue:
      name = name + SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-len(decimalValue))
    else:
      name = name + SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-len(decimalValue))
    
  return name