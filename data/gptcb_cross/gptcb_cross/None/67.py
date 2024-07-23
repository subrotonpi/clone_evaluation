def run(self): 
    print("Thread" + threading.current_thread().getId() + " starting") 
    lock = threading.Lock() 
    with lock: 
        print("Thread" + threading.current_thread().getId() + " acquired the monitor on BadRunnable.class") 
        latch.countDown() 
        while True: 
            try: 
                latch.wait() 
            except: 
                continue 
            break 
    print("Thread" + threading.current_thread().getId() + " released the monitor on BadRunnable.class") 
    print("Thread" + threading.current_thread().getId() + "ending")