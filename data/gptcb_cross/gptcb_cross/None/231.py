def run(lock):
    try:
        with lock:
            for i in range(0, 5):
                while id != token % N:
                    lock.wait()
                print(id, i)
                token += 1
                lock.notify_all()
    except InterruptedError as e:
        print(e)