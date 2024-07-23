def run ():
    while True:
        try:
            expensive_object = expensiveObjects.get()
            result = task()
            expensiveObjects.put(expensive_object)
            if result != None:
                counter = outputCount.get_and_increment()
                print(counter)
                if counter >= 100:
                    break
        except InterruptedException as e:
            print("Error!")