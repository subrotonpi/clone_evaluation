public void run () {

    synchronized (obj1) {

        latch.countDown ();

        try {

            latch.await ( /* Comment */ );

        } catch (InterruptedException e) {

            throw new RuntimeException ();

        }

        synchronized (obj2) {

            System.out.println ("Thread finished");

        }

    }

}
