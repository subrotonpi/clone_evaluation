public void run () {

    for (int i = 1;
 /* Comment */ 
    i < 10; i += 2) {

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
