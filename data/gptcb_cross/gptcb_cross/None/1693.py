def run():
    for i in range(1, 10, 2):
        with o:
            while not turn:
                o.wait()
            print(i)
            turn = not turn
            o.notify_all()