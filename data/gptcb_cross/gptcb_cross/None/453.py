def main():
  decimal = int(input())
  binary = ''
  if decimal <= 0:
    print('Please Enter more than 0')
  else:
    while decimal > 0:
      binary = str(decimal % 2) + binary
      decimal = decimal // 2
    print('binary is:', binary)

main()