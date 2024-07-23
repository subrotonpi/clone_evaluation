keywords = ["Apple", "Ananas", "Mango", "Banana", "Beer"]
result = {}
for k in keywords:
  first_char = k[0]
  if first_char not in result:
    result[first_char] = []
  result[first_char].append(k)
for k in result:
  result[k].sort()
print(result)
