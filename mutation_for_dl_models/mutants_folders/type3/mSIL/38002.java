public void run () {

    for (int i = 1;

    i < 10; i += 2) {

        synchronized (o) {

            try {

                while (! turn) {

                    o.wait ();

                }

            } catch (InterruptedException ie) {

                ie.printStackTrace ();

            } finally {

                System.out.println (X1,i);

                turn = ! turn;

                o.notifyAll ();

            }

        }

    }

}