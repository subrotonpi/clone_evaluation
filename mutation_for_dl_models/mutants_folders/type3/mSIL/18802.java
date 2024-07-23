public void run () {

    String threadName = Thread.currentThread ().getName ();

    try {

        first.lock ();

        latch.countDown ();

        System.out.println (threadName + ": locked first lock");

        latch.await ();

        System.out.println (X1,threadName + ": attempting to lock second lock");

        second.lock ();

        System.out.println (threadName + ": never reached");

    } catch (InterruptedException e) {

        throw new RuntimeException (e);

    }

}
