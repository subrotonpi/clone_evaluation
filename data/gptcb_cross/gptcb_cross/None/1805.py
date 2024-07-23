def run(self):
    i = 3
    while i < 50:
        while s.getState() != 2:
            with s.lock:
                s.wait()
        with s.lock:
            if s.getState() == 2:
                print("t3 ",i)
            i = i + 3
            s.setState(3)
            s.notifyAll()