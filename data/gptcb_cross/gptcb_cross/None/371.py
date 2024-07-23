def main(): 
    print("Enter Number to convert into words:") 
    num = int(input()) 
    rem = 0
    i = 0
      
    while(num > 0): 
        if(i == 0): 
            rem = num % 1000
            printText(rem) 
            num = num / 1000
            i += 1
              
        elif(num > 0): 
            rem = num % 100
            if(rem > 0): 
                text = denom.values()[i-1] + " " + text
            printText(rem) 
            num = num / 100
            i += 1
          
    if i > 0: 
        print(text)
    else: 
        print("Zero")