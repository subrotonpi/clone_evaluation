output = "" 
wordsMultiset = set() 
words = "AAABBBBCC".split("") 
wordsMultiset.update(words) 
for element, count in wordsMultiset.items (): 
    if element != '': 
        output += str(count) + element  
print(output) 
