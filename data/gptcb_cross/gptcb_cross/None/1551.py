def myThread(): 
    global saidHello 
    for i in range(sayThisManyTimes):
        while saidHello:
            time.sleep(0.1) 
        print("Hello") 
        saidHello = True

t = threading.Thread(target=myThread)
t.start() 

for i in range(sayThisManyTimes): 
    while not saidHello:
        time.sleep(0.1) 
    print("Hello") 
    saidHello = False