output = ""
words_multiset = collections.Counter() 
words = list("AAABBBBCC")
words_multiset.update(words)
for element in words_multiset.most_common():
    if element[0] != "":
        output += str(element[1]) + element[0]
print(output)
