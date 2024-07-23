public void run () {

    System.out.println ("Thread " + X1.currentThread ().getId () + " starting");

    synchronized (BadRunnable.class) {

        System.out.println ("Thread " + X1.currentThread ().getId () + " acquired the monitor on BadRunnable.class");

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

    System.out.println ("Thread " + X1.currentThread ().getId () + " released the monitor on BadRunnable.class");

    System.out.println ("Thread " + X1.currentThread ().getId () + " ending");

}
