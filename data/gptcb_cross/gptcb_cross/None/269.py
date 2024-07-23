def MyRunnable(expensiveObjects): 
	# Code Here 

executorService = threading.Thread(target=MyRunnable, args=(expensiveObjects,)) 
executorService.start() 
executorService.join(timeout=5) 

print("Final: " + outputCount.get())