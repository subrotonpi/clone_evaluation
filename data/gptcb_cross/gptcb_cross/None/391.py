def mytask(counter): 
    global atm_counter
    atm_counter += 1

thread_list = [] 
for i in range(4): 
    thread_list.append(threading.Thread(target=mytask, args=str(atm_counter))) 

for th in thread_list: 
    th.start() 

for th in thread_list: 
    th.join()

time.sleep(1 * 60 * 60)