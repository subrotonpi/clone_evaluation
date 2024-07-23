public void run () {

    String threadName = Thread.currentThread ().getName ();

    try {

        first.lock ();

        latch.countDown ();

        System.out.println (threadName + ": locked first lock");

        latch.await ();


        second.lock ();

        System.out.println (threadName + ": never reached");

    } catch (InterruptedException e) {

        throw new RuntimeException (e);

    }

}
