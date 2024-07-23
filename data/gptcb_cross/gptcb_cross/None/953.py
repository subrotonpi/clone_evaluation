def run(self): 
    print("Thread", threading.current_thread().getId(), "starting")
    BadRunnable.lock.acquire()
    print("Thread", threading.current_thread().getId(), "acquired the monitor on BadRunnable.class")
    self.latch.countDown()
    while True: 
        self.latch.wait()
        break
    BadRunnable.lock.release()
    print("Thread", threading.current_thread().getId(), "released the monitor on BadRunnable.class")
    print("Thread", threading.current_thread().getId(), "ending")