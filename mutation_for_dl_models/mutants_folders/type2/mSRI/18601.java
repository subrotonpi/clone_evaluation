public void run () {

    synchronized (obj1) {

        X1.countDown ();

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
