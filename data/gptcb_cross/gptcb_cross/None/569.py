def shuffle(array):
    n = len(array)
    for i in range(n):
        r = i + int(random.random()*(n-i))
        swap = array[r]
        array[r] = array[i]
        array[i] = swap