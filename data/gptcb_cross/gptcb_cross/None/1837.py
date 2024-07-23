def run (self):
    i = 2
    while i < 50:
        while self.s.getState() != 1:
            with self.s:
                self.s.wait()
        with self.s:
            if self.s.getState() == 1:
                print("t2:" + i)
                self.s.setState(2)
                i += 3
                self.s.notify_all()