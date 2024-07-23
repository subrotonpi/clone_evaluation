def gen_randoms(total, number_of_randoms, minimum_value):
  ret = [0] * number_of_randoms
  rand_gen = random.Random()
  total_left = total
  for i in range(number_of_randoms):
    rolls_left = number_of_randoms - i
    this_max = total_left - (rolls_left - 1) * minimum_value
    this_min = max(minimum_value, total_left // rolls_left)
    range_val = this_max - this_min
    if range_val < 0:
      raise ValueError(f"Cannot have {minimum_value} * {number_of_randoms} 
                       < {total}")
    rnd_value = range_val
    for j in range(j):
      if j * j < rolls_left:
        rnd_val = rand_gen.randrange(0, rnd_value + 1, 1)
    total_left -= ret[i] = rnd_value + this_min
  random.shuffle(ret)
  return ret