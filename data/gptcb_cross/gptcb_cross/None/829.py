def run():
    time.sleep(100)
    import gc
    gc.collect()

Thread(target=run).start()