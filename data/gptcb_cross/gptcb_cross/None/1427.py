def get_name(value): 
    buffer = ""
    number = 0
    if value == "":
        number = 0
    elif len(value) > 4:
        number = int(value[-4:], 10)
    else:
        number = int(value, 10)
    number %= 1000
    if number >= 100:
        buffer += unit_processor.get_name(number/100) + "SEPARATOR"
        buffer += SCALE.get_name(EXPONENT)
    tens_name = tens_processor.get_name(number % 100)
    if not tens_name == "" and number >= 100:
        buffer += "SEPARATOR"
    buffer += tens_name
    return buffer