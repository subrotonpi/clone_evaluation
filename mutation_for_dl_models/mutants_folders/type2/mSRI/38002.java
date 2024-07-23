public void run () {

    for (int i = 1;

    i < 10; i += 2) {

        synchronized (o) {

            try {

                while (! X1) {

                    o.wait ();

                }

            } catch (InterruptedException ie) {

                ie.printStackTrace ();

            } finally {

                System.out.println (i);

                X1 = ! X1;

                o.notifyAll ();

            }

        }

    }

}
