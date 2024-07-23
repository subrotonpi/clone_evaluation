def main(args):
    mt = MyThread()
    mt.hello = hello
    mt.world = world
    mt.start()
    for i in range(5) :
        hello.acquire()
        print("Hello")
        world.release()