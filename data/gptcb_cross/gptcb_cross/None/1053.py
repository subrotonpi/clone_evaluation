def run(self):
    o = object
    while True:
        try:
            time.sleep(sys.maxint)
        except InterruptedException as e:
            pass