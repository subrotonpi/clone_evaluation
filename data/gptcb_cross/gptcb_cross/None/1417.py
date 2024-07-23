values = [0] * 10
values[0] = 2
print(values[0], end=" ")
for i in range(1, len(values)):
    values[i] = values[i-1] + 2
    print(values[i], end=" ")
