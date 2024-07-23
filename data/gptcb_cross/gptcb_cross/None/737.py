def printPath(mat, i, j): 
  if(len(mat) == 0 or len(mat[0]) == 0): 
    print("Empty matrix")
    return
  print("(" + str(i) + "," + str(j) + ")") 
  rightValue = mat[i+1][j] if i >= 0 and i < len(mat)-1 and mat[i][j] < mat[i+1][j] else mat[i][j] 
  belowValue = mat[i][j+1] if j >= 0 and j < len(mat[0])-1 and mat[i][j] < mat[i][j+1] else mat[i][j] 
  aboveValue = mat[i-1][j] if i > 0 and i < len(mat)-1 and mat[i][j] < mat[i-1][j] else mat[i][j] 
  leftValue = mat[i][j-1] if j > 0 and j < len(mat[0])-1 and mat[i][j] < mat[i][j-1] else mat[i][j]
  if rightValue > leftValue: 
    if rightValue > belowValue: 
      if rightValue > aboveValue: 
        printPath(mat, i+1, j)
      else: 
        printPath(mat, i, j+1) 
    else: 
      if belowValue > aboveValue: 
        printPath(mat, i-1, j)
      else: 
        printPath(mat, i, j+1) 
  else: 
    if leftValue > belowValue: 
      if leftValue > aboveValue: 
        printPath(mat, i-1, j)
      else: 
        printPath(mat, i, j+1) 
    else: 
      if belowValue > aboveValue: 
        printPath(mat, i-1, j)
      else: 
        printPath(mat, i, j+1)