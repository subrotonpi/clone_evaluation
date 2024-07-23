def countString(str, value): 
    arr = str.split("") 
    tempString = "" 
    for i in arr: 
        tempString += i 
        for j in i: 
            print("Number of Occurrence of ", j, " is:", tempString.count(j)) 
    if value: 
        tempString2 = "" 
        for i in arr: 
            tempString2 += i 
            for j in i: 
                if (j == value): 
                    print("Number of Occurrence of ", j, " is:", tempString2.count(j))