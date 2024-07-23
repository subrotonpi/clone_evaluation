def shuffle(array):
  n = len(array)
  for i in range(n):
    r = i + random.randint(0, n - i)
    swap = array[r]
    array[r] = array[i]
    array[i] = swap