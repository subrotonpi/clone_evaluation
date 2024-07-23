def remove_even (k, n):
    counter = 0
    for i in range(n):
        if k[i] % 2 == 1:
            k[counter] = k[i]
            counter += 1
    for i in range(counter, n):
        k[i] = 0