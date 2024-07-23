def factorial(n, depth=0): 
    spaces = ' ' * depth 
    print(spaces + 'factorial(' + str(n) + ')')
    if n <= 1: 
        print(spaces + 'return 1')
        return 1
    fac = factorial(n-1, depth + 1)
    print(spaces + 'return ' + str(n) + ' * ' + str(fac) + ' = ' + str(n * fac))
    return n * fac