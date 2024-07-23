list = []
from builtins import input
while True:
  print("Current List is " , list)
  print("Add more? (y/n)")
  
  x = input()
  if x.startswith("y"):
    print("Enter:")
    list.append(input())
  else:
    break
print("List is " , list)
arr = list
print("Array is " , arr)
