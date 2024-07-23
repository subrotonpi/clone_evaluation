def run(): 
    try: 
        __import__('time').sleep(100) 
    except InterruptedException as e: 
        print(e) 
    __import__('gc').collect() 

thread = __import__('threading').Thread(target=run) 
thread.start()