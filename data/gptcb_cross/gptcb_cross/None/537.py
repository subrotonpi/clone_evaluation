def countString(string,searchKey): 
    count = 0
    for i in string:
        if i == searchKey:
            count +=1
    print("Number of Occurrence of " + searchKey + " is " + str(count) + " in string " + string)