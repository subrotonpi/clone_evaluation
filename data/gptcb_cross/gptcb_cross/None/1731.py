def create_pascal(n):
  Pascal = [[1]*(i+1) for i in range(n)]
  for i in range(n):
    for j in range(1,i):
      Pascal[i][j] = Pascal[i-1][j-1] + Pascal[i-1][j]
  return Pascal
def print_pascal(Pascal):
  for i in range(len(Pascal)):
    for j in range(len(Pascal[i])):
      print(Pascal[i][j], end=" ")
    print("")

n = 15
Pascal = create_pascal(n)
print_pascal(Pascal)