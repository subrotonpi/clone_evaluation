def main(): 
  args = input("Please input a value of 1-5: ")
  length_input = len(args)
  if length_input <= 0: 
    print("ERROR: Please input a value of 1-5")
  for i in range(length_input): 
    for j in range(i): 
      print("*", end="")
    print()
 
if __name__=="__main__":
  main()