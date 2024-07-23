import sys
from collections import *
integers = []
print("Enter number 1")
integers.append(int(sys.stdin.readline().strip()))
print("Enter number 2")
integers.append(int(sys.stdin.readline().strip()))
print("Enter number 3")
integers.append(int(sys.stdin.readline().strip()))
print("Enter number 4")
integers.append(int(sys.stdin.readline().strip()))
print("Enter number 5")
integers.append(int(sys.stdin.readline().strip()))
integers.sort(key=lambda x: abs(x))
print("The number near zero 0 is " + str(integers[0]))
