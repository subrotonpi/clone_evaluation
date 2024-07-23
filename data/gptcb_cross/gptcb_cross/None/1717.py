def main(args): 
    str = "abcdabghplhhnfl".lower() 
    ar = [0] * 26
    for i in range(len(str)): 
        j = ord(str[i]) - ord('a') 
        if ar[j] == 0: 
            ar[j] = 1
        else: 
            ar[j] += 1
    for i in range(len(ar)): 
        if ar[i] > 1: 
            c = chr(97 + i) 
            print("'" + c + "' comes " + str(ar[i]) + " times.")