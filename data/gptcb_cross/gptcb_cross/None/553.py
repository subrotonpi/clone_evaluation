def main(): 
   twoTo10 = 1024
   sum_2_10 = 0
   for i in range(1,1001): 
      sum_2_10 += pow(i, i, twoTo10)
      sum_2_10 %= twoTo10
   
   fiveTo10 = 9765625
   sum_5_10 = 0
   for i in range(1,1001): 
      sum_5_10 += pow(i, i, fiveTo10)
      sum_5_10 %= fiveTo10

   tenTo10 = 10000000000
   answer = sum_2_10 * inverse(fiveTo10, twoTo10) * fiveTo10 + sum_5_10 * inverse(twoTo10, fiveTo10) * twoTo10
   answer %= tenTo10

   print(answer)

main()