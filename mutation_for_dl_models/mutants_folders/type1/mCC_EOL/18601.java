public void run () { // EOL Comment

    synchronized (obj1) {

        latch.countDown ();

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
