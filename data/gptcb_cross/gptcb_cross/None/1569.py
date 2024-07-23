def main(args=[]):
    try:
        tic = Tic()
        tac = Tac()
        toe = Toe()

        t1 = Thread(target=tic)
        t2 = Thread(target=tac)
        t3 = Thread(target=toe)

        t1.start()
        t1.join()
        if not t1.isAlive():
            t2.start()
        t2.join()
        if not t2.isAlive():
            t3.start()
    except InterruptedException as e:
        e.printStackTrace()