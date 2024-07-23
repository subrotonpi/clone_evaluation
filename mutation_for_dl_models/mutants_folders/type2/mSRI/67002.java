public synchronized void run () {

    int X1 = 3;

    while (X1 < 50) {

        while (s.getState () != 2) {

            synchronized (s) {

                try {

                    s.wait ();

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }

        synchronized (s) {

            if (s.getState () == 2) System.out.println ("t3 " + X1);

            X1 = X1 + 3;

            s.setState (3);

            s.notifyAll ();

        }

    }

}
