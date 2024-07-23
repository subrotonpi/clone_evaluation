import collections
inp = input()
arrlist = []
for char in inp:
    arrlist.append(char)
for char in inp:
    x = arrlist.count(char)
    print("Frequency of " + char + "  is:   " + str(x))
