def run():
    threadName = threading.currentThread().getName()
    try:
        first.acquire()
        latch.countDown()
        print(threadName + ': locked first lock')
        latch.wait()
        print(threadName + ': attempting to lock second lock')
        second.acquire() 
        print(threadName + ': never reached')

    except InterruptedException as e:
        raise RuntimeError(e)