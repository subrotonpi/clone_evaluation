def main(a):
  print("Enter the String")
  st = input()
  ar = [0]*256
  for i in range(len(st)):
    ar[ord(st[i])] += 1
  for i in range(256):
    if ar[i] > 0:
      if ar[i] == 1:
        print(chr(i))
      else:
        print(f"{chr(i)}{ar[i]}")