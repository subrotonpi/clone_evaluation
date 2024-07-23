public void run () {

    System.X1.println ("Thread " + Thread.currentThread ().getId () + " starting");

    synchronized (BadRunnable.class) {

        System.X1.println ("Thread " + Thread.currentThread ().getId () + " acquired the monitor on BadRunnable.class");

        latch.countDown ();

        while (true) {

            try {

                latch.await ();

            } catch (InterruptedException ex) {

                continue;

            }

            break;

        }

    }

    System.X1.println ("Thread " + Thread.currentThread ().getId () + " released the monitor on BadRunnable.class");

    System.X1.println ("Thread " + Thread.currentThread ().getId () + " ending");

}
