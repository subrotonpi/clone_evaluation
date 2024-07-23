def main(args):
  if len(args) != 2:
    print ('usage: ./zipf size skew')
    sys.exit(-1)
  
  zipf = ZipfGenerator(int(args[0]), float(args[1]))
  
  for i in range(1, 11):
    print(str(i) + ' ' + print(zipf.getProbability(i)))
  
  hist = [0] * 12

  print('Testing the probability distribution:')
  sum = 0
  for i in range(1, 1000000):
    hist[zipf.next()] += 1
  
  for i in range(0, 12):
    print(str(i) + ' ' + str(hist[i]/1000000.0))