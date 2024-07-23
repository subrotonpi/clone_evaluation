def run(): 
    threadName = threading.current_thread().getName() 
    try: 
        first.acquire() 
        latch.countDown()
        print(threadName + ": locked first lock")
        latch.wait() 
        print(threadName + ": attempting to lock second lock")
        second.acquire()
        print(threadName + ": never reached")
    except InterruptedError:
        print("Error occurred")