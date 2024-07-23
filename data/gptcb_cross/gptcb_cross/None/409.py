def printTable(countries, populations):
    if len(countries) != 0:
        longestNameInput = len(countries[0])
        longestPopInput = len(str(populations[0]))
        for i, country in enumerate(countries):
            countLength = len(country)
            popLength = len(str(populations[i]))
            if countLength > longestNameInput:
                longestNameInput = countLength
            if popLength > longestPopInput:
                longestPopInput = popLength

        for i, country in enumerate(countries):
            print(country, end="")
            for j in range(longestNameInput - len(country)):
                print(" ", end="")
            print(" | ", end="")
            for k in range(longestPopInput - len(str(populations[i]))):
                print(" ", end="")
            print(populations[i])