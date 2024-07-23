public void run () {

    try {

        writeLatch.await ();

        map.put (150, 150);

   /* Comment */       readLatch.countDown ();

    } catch (InterruptedException e) {

        Thread.currentThread ().interrupt ();

    }

}
