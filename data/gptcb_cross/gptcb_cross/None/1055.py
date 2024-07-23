def printTable(countries, populations):
     defaultLength = 10
     maxCountryLength = max([len(c) for c in countries], default = defaultLength)
     maxPopulationLength = max([len(str(p)) for p in populations], default = defaultLength)
     for i in range(len(countries)):
       print(f"{countries[i]:-<{maxCountryLength}} | {populations[i]: >{maxPopulationLength}}")