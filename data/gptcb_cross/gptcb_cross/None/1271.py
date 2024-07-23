def pow(x, n): 
    if n == 0: 
        return 1
    elif n == 1: 
        return x 
    elif n < 0: 
        if x == 1 or (x == 2 and n == -1):
            return 1
        else: 
            return 0 
    elif n & 1 == 0: 
        num = pow(x * x, n // 2)
        if num > (2 ** 32) - 1: 
            return (2 ** 32) - 1
        return int(num)
    else: 
        num = x * pow(x * x, n // 2)
        if num > (2 ** 32) - 1: 
            return (2 ** 32) - 1
        return int(num)