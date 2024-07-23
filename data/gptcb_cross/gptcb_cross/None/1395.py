def run(): 
    i = 1 
    while (i < 50): 
        while s.getState() != 3: 
            with s: 
                s.wait() 
                
        with s: 
            if s.getState() == 3: 
                print("t1 " + str(i)) 
            s.state = 1 
            i = i + 3 
            s.notifyAll()