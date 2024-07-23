def main():
  string = 'aaabbbbbaccc'
  counter = 0 
  result = ''
  i = 0
  while i < len(string): 
    counter = 1
    for j in range(i+1, len(string)): 
      if string[i] == string[j]:
        counter += 1
    result = result + string[i] + str(counter)
    string = string.replace(string[i], '')
  print('result is = ' + result)

if __name__ == '__main__':
  main()