s = 'this is a this is this a this yes this is a this what it may be i do not care about this'
words = {}
a = s.split()
for str in a:
    if str in words:
        words[str] += 1
    else:
        words[str] = 1
print(words)
