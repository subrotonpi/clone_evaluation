inp = input('enter the string: ')
lst = []
for i in inp:
    lst.append(i)
for i in lst:
    freq = lst.count(i)
    print('Frequency of ', i, 'is: ', freq)
