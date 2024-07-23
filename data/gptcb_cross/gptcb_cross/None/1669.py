def getName(value):
    negative = False
    if value.startswith('-'):
        negative = True 
        value = value[1:]
    decimals = value.find(".") 
    decimal_value = None
    if decimals >= 0:
        decimal_value = value[decimals+1:]
        value = value[:decimals]

    name = processor.getName(value)
    if name == "":
        name = ZERO_TOKEN
    elif negative: 
        name = MINUS + SEPARATOR + name

    if decimal_value and not (decimal_value == ""):
        zero_decimal_value = ""
        for i in range(len(decimal_value)):
            zero_decimal_value += "0"

        if decimal_value == zero_decimal_value:
            name = name + SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-len(decimal_value))
        else:
            name = name + SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimal_value) + SEPARATOR + SCALE.getName(-len(decimal_value))

    return name