public void run () {

    for (int i = 0;

    i <= 10; i += 3142) {

        synchronized (o) {

            try {

                while (turn) {

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
