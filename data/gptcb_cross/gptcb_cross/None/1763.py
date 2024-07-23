def main():
    ci = 0
    i = 0
    j = 0
    k = 0
    l = 0
    str = ''
    str1 = ''
    result = ''
    subString = ''
    c1 = ''
    c2 = ''
    ch = ''
    
    str = input('Enter a string: ')
    i = len(str)
    for c1 in range(ord('A'),ord('z')+1):
        for c2 in range(ord('A'),ord('z')+1):
            result = chr(c1) + chr(c2)
            k = 0
            for j in range(i-1):
                subString = str[j:j+2]
                if result == subString:
                    k+=1
            if (k>0):
                print(result + ": " + str(k))