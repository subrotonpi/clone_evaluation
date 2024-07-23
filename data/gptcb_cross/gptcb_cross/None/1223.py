matrix = [[1,2,2], [2,2,3], [0,1,2]]
result = 1
for i in range(len(matrix)): 
  result = result * matrix[i][i]
print("Result: " + str(result))
