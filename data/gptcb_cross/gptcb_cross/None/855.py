def getName(value):
    negative = False
    if value.startswith('-'):
        negative = True
        value = value[1:]
    decimals = value.index('.')
    decimalValue = None
    if (decimals >= 0):
        decimalValue = value[decimals+1:]
        value = value[0:decimals]
    name = processor.getName(value)
    if name == '':
        name = ZERO_TOKEN
    elif negative == True:
        name = MINUS + SEPARATOR + name
    if decimalValue is not None and decimalValue != '':
        zeroDecimalValue = '0'*len(decimalValue)
        if (decimalValue == zeroDecimalValue):
            name += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-len(decimalValue))
        else:
            name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-len(decimalValue))
    return name