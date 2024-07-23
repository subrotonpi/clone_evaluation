def printTable(countries, populations): 
    if len(countries) != 0: 
        longestNameInput = len(countries[0]) 
        longestPopInput = len(str(populations[0])) 
        for i in range(len(countries)): 
            countLength = len(countries[i]) 
            popLength = len(str(populations[i])) 
            if countLength > longestNameInput: 
                longestNameInput = countLength 
            if popLength > longestPopInput: 
                longestPopInput = popLength 
        for i in range(len(countries)): 
            print(countries[i], end = "") 
            for j in range(longestNameInput - len(countries[i])): 
                print(" ", end = "") 
            print(" | ", end = "") 
            for k in range(longestPopInput - len(str(populations[i]))): 
                print(" ", end = "") 
            print(str(populations[i]))