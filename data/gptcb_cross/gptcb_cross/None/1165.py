import sys
try:
    s = input('Enter String: ')
    i = int(input('Enter Integer: '))
except ValueError:
    print('Invalid Format!')
