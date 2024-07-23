def shuffle(numberOfCards):
  for i in range(numberOfCards):
    j = random.randint(0, numberOfCards - i) + i
    tmp = deck[i]
    deck[i] = deck[j]
    deck[j] = tmp