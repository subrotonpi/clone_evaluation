def unsignedMultiplyOverflows(a: int, b: int): 
    if a == 0 or b == 0: 
        return False
    a_half = a >> 1
    b_half = b >> 1
    a_last_bit = a & 1
    b_last_bit = b & 1
    if a_last_bit == 0: 
        return sys.maxsize / b < a_half
    elif b_last_bit == 0: 
        return sys.maxsize / a < b_half
    else: 
        return (sys.maxsize - b_half) / b < a_half