def duplication(): 
    max=100  
    min=1 
    index=0 
    all=[0]*20 
    while index<20: 
        randomNum = random.randint(min,max) 
        if randomNum in all: 
            continue 
        else: 
            all[index]=randomNum 
            index+=1