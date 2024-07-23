public void run () {

    synchronized (obj1) {

        latch.countDown ();

        try {

            latch.await ();

        } catch (InterruptedException e) {

            throw new RuntimeException ();
 // EOL Comment
        }

        synchronized (obj2) {

            System.out.println ("Thread finished");

        }

    }

}
