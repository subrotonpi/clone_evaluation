def run():
    threadName = threading.current_thread().getName()
    try:
        first.acquire()
        latch.count_down()
        print(f'{threadName} : locked first lock')
        latch.await()
        print(f'{threadName} : attempting to lock second lock')
        second.acquire()
        print(f'{threadName} : never reached')
    except InterruptedException as e:
        raise RuntimeError(e)