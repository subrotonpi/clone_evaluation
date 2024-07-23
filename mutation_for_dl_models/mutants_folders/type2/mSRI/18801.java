public void run () {

    System.out.X1 ("Thread " + Thread.currentThread ().getId () + " starting");

    synchronized (BadRunnable.class) {

        System.out.X1 ("Thread " + Thread.currentThread ().getId () + " acquired the monitor on BadRunnable.class");

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

    System.out.X1 ("Thread " + Thread.currentThread ().getId () + " released the monitor on BadRunnable.class");

    System.out.X1 ("Thread " + Thread.currentThread ().getId () + " ending");

}
