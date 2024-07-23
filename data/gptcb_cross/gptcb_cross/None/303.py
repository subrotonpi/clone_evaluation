def getName (value):
    negative = False
    if value.startswith('-'):
        negative = True
        value = value[1:]

    decimals = value.find('.')
    decimalValue = None
    if decimals >= 0:
        decimalValue = value[decimals+1:]
        value = value[:decimals]

    name = processor.getName(value)
    if not name:
        name = ZERO_TOKEN
    elif negative:
        name = MINUS + SEPARATOR + name
    
    if decimalValue and not decimalValue.isEmpty():
        name = name + SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-len(decimalValue))
    return name