def printTable(countries, populations):
    defaultLength = 10
    maxCountryLength = max([len(country) for country in countries]) or defaultLength
    maxPopulationLength = max([len(str(population)) for population in populations]) or defaultLength
    for i in range(len(countries)):
        print(f'{countries[i]:{maxCountryLength}} | {str(populations[i]):{maxPopulationLength}}')