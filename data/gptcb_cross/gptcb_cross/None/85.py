def run():
    print("Starting thread...")
    try:
        runnable.run()
        print("Thread done")
    except:
        print("Thread exited abnormally")