def countString(str): 
    if str != None: 
        length = len(str) 
        chars = sorted(str) 
        if length > 0: 
            x = chars[0] 
            count = 1 
            for i in range(1, length): 
                if (chars[i] == x): 
                    count += 1
                else: 
                    print("Number of Occurrence of '" + chars[i - 1] + "' is: " + str(count)) 
                    x = chars[i] 
                    count = 1 
                    
            print("Number of Occurrence of '" + chars[length - 1] + "' is: " + str(count))