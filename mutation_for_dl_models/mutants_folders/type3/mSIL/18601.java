public void run () {

    synchronized (obj1) {

        latch.countDown (X1);

        try {

            latch.await ();

        } catch (InterruptedException e) {

            throw new RuntimeException ();

        }

        synchronized (obj2) {

            System.out.println ("Thread finished");

        }

    }

}
