def prime_factor():
  input = int(input("Enter a number: "))
  factors = []
  for num in range(1,input + 1):
    if num > 1:
      for i in range(2,num):
        if (num % i) == 0:
          break
      else:
        if (input % num) == 0:
          factors.append(num)
  for element in factors:
    print(element)