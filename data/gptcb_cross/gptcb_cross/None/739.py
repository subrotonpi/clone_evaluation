def MyRunnable(queue):
    while not queue.empty():
        expensiveObjects.get()
        #add output count

for i in range(4):
    thread = threading.Thread(target=MyRunnable, args=(expensiveObjects,))
    execuor_threads.append(thread)
    thread.start()

for thread in execuor_threads:
    thread.join()

print("Final:" + outputCount.get())