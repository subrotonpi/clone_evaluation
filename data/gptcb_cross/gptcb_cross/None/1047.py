def main(): 
    name = "AnuvratAnuvra"
    arr = list(name) 
    map = {} 
      
    for ch in arr: 
        if ch in map: map[ch] = map[ch] + 1
        else : map[ch] = 1
    for key, value in map.items(): 
        if value > 1: 
            print(key,":", value) 
  
if __name__ == "__main__": 
    main()