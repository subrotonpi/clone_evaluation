def main (args): 
   array = []
   n = int(input("Enter n: "))
   m = int(input("Enter m: "))
   for i in range (0, n): 
       list_j = [] 
       array.append(list_j) 
       for j in range (0, m): 
           list_j.append(int(input("Enter value: ")))
      
   print("Result: ") 
   print(array)