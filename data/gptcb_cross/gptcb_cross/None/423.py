needle = "ABC"
haystack = "ABCDSGDABCSAGAABCCCCAAABAABC"
number_of_occurrences = 0
index = haystack.find(needle)
while index != -1:
    number_of_occurrences += 1
    haystack = haystack[index + len(needle):]
    index = haystack.find(needle)
print(number_of_occurrences)
