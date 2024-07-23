def main():  
    list = ["A", "B", "A", "B", "C", "D"]  
    list.sort() 
      
    arraylist = [] 
    k = 0
  
    for i in range(len(list)): 
        count = list.count(list[i]) 
        
        arraylist.append([]) 
        for j in range(count): 
            arraylist[k].append(list[i]) 
          
        i += count - 1
        k += 1
  
    for arr in arraylist: 
        for s in arr: 
            print(s,end=" ") 
        print("") 
  
if __name__=="__main__": 
    main()