public void run () {

    System.out.println ("Thread " + Thread.currentThread ().getId () + " starting");

    synchronized (BadRunnable.class) {

        System.out.println ("Thread " + Thread.currentThread ().getId () + "ArtificialStringReplacement");

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
