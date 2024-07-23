def main_thread():
    future = readPage()
    future2 = future.thenAccept(page):
        print(page)
        raise IllegalArgumentException('unexpected exception')
    )
    future2.exceptionally(e):
        traceback.print_exception(*e.args)
        return None

if __name__ == '__main__':
    executor = ThreadPoolExecutor()
    future = executor.submit(main_thread)
    future.result()