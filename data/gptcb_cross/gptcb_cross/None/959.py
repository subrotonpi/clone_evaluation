import time
makeMore = True
while makeMore:
    Leakee(0).check()
while True:
    time.sleep(1)
    print("memory={} / {}".format(Runtime.getRuntime().freeMemory(), Runtime.getRuntime().totalMemory()))
