def ThreadAction(): 
    try: 
        time.sleep(100) 
    except InterruptedException: 
        print("Thread Interrupted!")
    finally: 
        import gc 
        gc.collect()

startThread = threading.Thread(target=ThreadAction)
startThread.start()