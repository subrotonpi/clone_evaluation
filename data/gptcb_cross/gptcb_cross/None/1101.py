def go():
    acquireUninterruptibly()
    print(max-availablePermits())
    go()
go()