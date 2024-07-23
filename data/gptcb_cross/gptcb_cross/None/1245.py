def printTable(countries, populations):
    if len(countries) == 0 or len(populations) == 0 or len(countries) != len(populations):
        return

    longestCountry = max(len(str(item)) for item in countries)
    longestPop = max(len(str(item)) for item in populations)

    for i in range(len(countries)):
        formatString = "{:<" + str(longestCountry) + "} | {:>" + str(longestPop) + "}"
        print(formatString.format(countries[i], populations[i]))