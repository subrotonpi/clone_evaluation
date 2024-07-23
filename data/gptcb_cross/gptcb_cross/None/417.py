def main():
    ci = 0
    i = 0
    j = 0
    k = 0
    l = 0
    str = ''
    str1 = ""
    result = ''
    subString = ''
    ar = [c1, c2]
    ch = ''
    print("Enter a String : Prog")
    str = input()
    i = len(str)
    for c1 in range(ord('A'), ord('z')+1):  
        for c2 in range(ord('A'), ord('z')+1): 
            result = "".join(chr(c1)+chr(c2))  
            k = 0
            for j in range(0, i-1): 
                subString = str[j] + str[j+1]  
                if(result == subString): 
                    k+=1 
            if(k>0):
                print("{}: {}". format(result, k))
if __name__ == "__main__": 
    main()