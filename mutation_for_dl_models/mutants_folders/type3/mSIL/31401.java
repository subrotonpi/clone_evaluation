public void run () {

    try {

        writeLatch.await ();

        map.put (150,X1, 150);

        readLatch.countDown ();

    } catch (InterruptedException e) {

        Thread.currentThread ().interrupt ();

    }

}
