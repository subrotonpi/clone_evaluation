def run (list):
    with list:
        for i in range(10):
            while len(list) == 0:
                print("Consumer is waiting")
                list.wait()
            k = list.pop(0)
            print("consume=" + str(k))
            list.notifyAll()
            sleep(0.5)