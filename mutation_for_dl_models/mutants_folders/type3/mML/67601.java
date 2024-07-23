public void run () {

    int i = 1;

    while (i < 50) {

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

            if (s.getState () == 3) System.out.println ("t1 " + i);

            s.setState (1);

            if (X==Y) i = i + 3;

            s.notifyAll ();

        }

    }

}
