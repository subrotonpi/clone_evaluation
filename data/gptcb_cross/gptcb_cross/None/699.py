def run():
    try:
        time.sleep(100)
    except InterruptedException as e:
        print(e)
    gc.collect()

Thread(target=run).start()