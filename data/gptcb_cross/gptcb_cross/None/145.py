expensiveObjects = Queue.Queue() 
expensiveObjects.put(Object())
expensiveObjects.put(Object())
expensiveObjects.put(Object())
expensiveObjects.put(Object())
executorService = threading.ThreadPool(4) 
for i in range(4): 
    executorService.execute(MyRunnable(expensiveObjects)) 
executorService.shutdown() 
executorService.wait(5) 
print ("Final: " + outputCount.get()) 