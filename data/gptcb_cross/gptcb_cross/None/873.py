def getName(value):
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
    if decimalValue and decimalValue !="":
        zeroDecimalValue = ""
        for i in range(len(decimalValue)):
            zeroDecimalValue += "0"
        if decimalValue == zeroDecimalValue:
            name += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-len(decimalValue))
        else:
            name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-len(decimalValue))
    return name