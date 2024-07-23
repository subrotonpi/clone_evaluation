import random
l = []
for i in range(10):
    l.append(int(input()))
random.shuffle(l)
for j in range(10):
    print(l[j])
