def getName(value):
    negative = False

    if value.startswith('-'):
        negative = True
        value = value[1:]

    decimals = value.find('.')
    decimalValue = None

    if decimals>-1:
        decimalValue = value[decimals+1:]
        value = value[0:decimals]

    name = processor.getName(value)
    if name== '':
        name = ZERO_TOKEN
    elif negative:
        name = MINUS + SEPARATOR + name

    if decimalValue != None and decimalValue != '':
        name = name + SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.GetName(-len(decimalValue))

    return name