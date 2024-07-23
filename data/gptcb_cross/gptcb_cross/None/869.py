def run():
    try:
        time.sleep(100)
    except InterruptedException as e:
        e.printStackTrace()
    gc.collect()

Thread(target=run).start()