output = ''
words_multiset = collections.Counter()
words = 'AAABBBBCC'.split('')
words_multiset.update(words)
for k,v in words_multiset.items():
    if k != '':
        output += str(v) + k
print(output)
