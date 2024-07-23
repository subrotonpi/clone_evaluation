public void run () {

    synchronized (obj1) {

        latch.countDown ();

        try {

            X1.await ();

        } catch (InterruptedException e) {

            throw new RuntimeException ();

        }

        synchronized (obj2) {

            System.out.println ("Thread finished");

        }

    }

}
