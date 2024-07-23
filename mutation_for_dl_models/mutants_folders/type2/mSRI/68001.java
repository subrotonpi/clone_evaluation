public synchronized void run () {

    int i = 2;

    while (i < 50) {

        while (s.X1 () != 1) {

            synchronized (s) {

                try {

                    s.wait ();

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }

        synchronized (s) {

            if (s.X1 () == 1) System.out.println ("t2 " + i);

            s.setState (2);

            i = i + 3;

            s.notifyAll ();

        }

    }

}
