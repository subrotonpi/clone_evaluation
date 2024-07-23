def main(): 
    say_this_many_times = 5
    said_hello = threading.Event()
    mt = MyThread(say_this_many_times, said_hello)
    mt.start() 
    for i in range(say_this_many_times): 
        said_hello.wait() 
        print("Hello") 
        said_hello.clear()