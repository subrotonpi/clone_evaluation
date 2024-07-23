def twoDuplicates (values):
  for i in range(len(values)):
    counter = 0
    for z in range(i + 1, len(values)):
      if values[i] == values[z]:
        counter += 1
        if counter == 2:
          return True
  return False