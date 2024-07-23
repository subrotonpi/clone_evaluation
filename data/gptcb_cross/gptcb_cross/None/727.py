def run():
    try:
        time.sleep(100)
    except InterruptedError as e:
        print(e.message)

    import gc
    gc.collect()

thread = Thread(target = run)
thread.start()