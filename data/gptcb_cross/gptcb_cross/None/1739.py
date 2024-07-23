def start_server():
    try:
        t = threading.Thread(target=threaded_function)
        t.start()
        t.join()
    except InterruptedException:
        print("Thread was interrupted")
def threaded_function():
    try:
        time.sleep(5000)
    except InterruptedException:
        print("Thread was interrupted")

print("Starting Server!")
start_server()
print("Server is done!")