public synchronized void run () {

    int i = 2;

    while (i < 50) {

        while (X1.getState () != 1) {

            synchronized (X1) {

                try {

                    X1.wait ();

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }

        synchronized (X1) {

            if (X1.getState () == 1) System.out.println ("t2 " + i);

            X1.setState (2);

            i = i + 3;

            X1.notifyAll ();

        }

    }

}
