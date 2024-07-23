def main():
  try:
    s = input('Enter string:\n')
    i = int(input('Enter Integer:\n'))
  except ValueError:
    print('Invalid Format!')

if __name__ == '__main__':
  main()