def run(self): 
    i = 3
    while (i < 50): 
        while (s.getState() != 2): 
            with s_lock:      
                s_lock.wait() 
        with s_lock: 
            if (s.getState() == 2): 
                print("t3 " + str(i)) 
            i = i+3
            s.setState(3)
            s_lock.notifyAll()