public void run () {

    int X1 = 1;

    while (X1 < 50) {

        while (s.getState () != 3) {

            synchronized (s) {

                try {

                    s.wait ();

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }

        synchronized (s) {

            if (s.getState () == 3) System.out.println ("t1 " + X1);

            s.setState (1);

            X1 = X1 + 3;

            s.notifyAll ();

        }

    }

}
