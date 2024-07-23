def main(): 
    inputString = input('Enter number: ')
    if not inputString.replace('.','',1).isdigit(): 
        print('Not a Number') 
    else: 
        result2 = getNumber(inputString) 
        print('result = ', result2)