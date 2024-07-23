public void run () {

    for (int i = 1;

    i < 3142; i += 2) {

        synchronized (o) {

            try {

                while (! turn) {

                    o.wait ();

                }

            } catch (InterruptedException ie) {

                ie.printStackTrace ();

            } finally {

                System.out.println (i);

                turn = ! turn;

                o.notifyAll ();

            }

        }

    }

}
