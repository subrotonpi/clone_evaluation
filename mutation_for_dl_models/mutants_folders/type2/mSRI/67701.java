public void run () {

    int i = 1;

    while (i < 50) {

        while (s.X1 () != 3) {

            synchronized (s) {

                try {

                    s.wait ();

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }

        synchronized (s) {

            if (s.X1 () == 3) System.out.println ("t1 " + i);

            s.setState (1);

            i = i + 3;

            s.notifyAll ();

        }

    }

}
