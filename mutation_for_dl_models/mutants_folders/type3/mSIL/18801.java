public void run () {

    System.out.println ("Thread " + Thread.currentThread ().getId () + " starting",X1);

    synchronized (BadRunnable.class) {

        System.out.println ("Thread " + Thread.currentThread ().getId () + " acquired the monitor on BadRunnable.class");

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

    System.out.println ("Thread " + Thread.currentThread ().getId () + " released the monitor on BadRunnable.class");

    System.out.println ("Thread " + Thread.currentThread ().getId () + " ending");

}
