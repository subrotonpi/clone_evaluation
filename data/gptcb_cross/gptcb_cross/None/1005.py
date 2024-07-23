def gcd(a, b):
    if a == int.min:
        if b == int.min:
            raise ValueError('gcd exceeded int.max')
        return 1 << (abs(b)).bit_length()
    if b == int.min:
        return 1 << (abs(a)).bit_length()
    a = abs(a)
    b = abs(b)
    if a == 0:
        return b
    if b == 0:
        return a
    factors_of_two_in_a = (a).bit_length() 
    factors_of_two_in_b = (b).bit_length() 
    common_factors_of_two = min(factors_of_two_in_a, factors_of_two_in_b) 
    a = a >> factors_of_two_in_a
    b = b >> factors_of_two_in_b
    while(a != b):
        if a > b:
            a = a - b 
            a = a >> (a).bit_length()
        else:
            b = b - a 
            b = b >> (b).bit_length()
    return a << common_factors_of_two