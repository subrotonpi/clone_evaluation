def main(): 
    s = State() 
    t1 = threading.Thread(target=T1, args=(s,)) 
    t2 = threading.Thread(target=T2, args=(s,)) 
    t3 = threading.Thread(target=T3, args=(s,)) 
    t1.start() 
    t2.start() 
    t3.start()