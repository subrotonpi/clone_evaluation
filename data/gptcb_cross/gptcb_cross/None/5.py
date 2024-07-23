def run(s): 
    i = 2
    while i < 50:
        while s.getState() != 1: 
            with s lock: 
                try: 
                    s.wait() 
                except InterruptedException as e: 
                    print(e)
                    
        with s lock:
            if s.getState() == 1: 
                print("t2", i) 
            s.setState(2)
            i = i + 3
            s.notify_all()