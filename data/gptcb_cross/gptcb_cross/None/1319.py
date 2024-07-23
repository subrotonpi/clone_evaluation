def main(args): 
  n = int(input()) 

  a = [[int(input()) for _ in range(n)] 
              for _ in range(n)] 
  l_sum = 0
  for i in range(n): 
    l_sum += a[i][i]  

  r_sum = 0
  for j in range(n): 
    r_sum += a[j][n - 1 - j]  
  
  sum = l_sum + r_sum
  print(sum)