def stars(): 
    MAX_WIDTH = 7 
    for i in range(7): 
        width = 0 
        if(i < 3): 
            width = MAX_WIDTH - i * 2 
        elif(i > 3): 
            width = (i-3) * 2 + 1 
        else: 
            width = 1 
        for j in range((MAX_WIDTH-width)//2): 
            print(" ", end = "") 
        for j in range(width): 
            print("*", end = "") 
        for j in range((MAX_WIDTH-width)//2): 
            print(" ", end = "") 
        print("")