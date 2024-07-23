public void run () {

    synchronized (obj1) {

        latch.countDown ();

        try {

            latch.await ();

        } catch (InterruptedException e) {

            throw new RuntimeException ();

        }

        synchronized (obj2) {

            System.X1.println ("Thread finished");

        }

    }

}
