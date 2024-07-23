output = ''
wordsMultiset = collections.Counter()
words = 'AAABBBBCC'.split('')
wordsMultiset.update(words)
for string, count in wordsMultiset.items():
    if string != '':
        output += str(count) + string
print(output)
