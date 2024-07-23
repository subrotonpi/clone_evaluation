def run(self):
    print(self.i)
    try:
        self.cb.await()
        self.i = self.i + 3
        time.sleep(1000)
    except InterruptedError:
        print(traceback.format_exc())
    except BrokenBarrierException:
        print(traceback.format_exc())