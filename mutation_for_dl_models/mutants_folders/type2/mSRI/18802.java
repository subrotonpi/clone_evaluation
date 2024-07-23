public void run () {

    String X1 = Thread.currentThread ().getName ();

    try {

        first.lock ();

        latch.countDown ();

        System.out.println (X1 + ": locked first lock");

        latch.await ();

        System.out.println (X1 + ": attempting to lock second lock");

        second.lock ();

        System.out.println (X1 + ": never reached");

    } catch (InterruptedException e) {

        throw new RuntimeException (e);

    }

}
