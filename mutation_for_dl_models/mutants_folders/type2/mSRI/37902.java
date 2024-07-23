public void run () {

    for (int i = 0;

    i <= 10; i += 2) {

        synchronized (o) {

            try {

                while (turn) {

                    o.wait ();

                }

            } catch (InterruptedException X1) {

                X1.printStackTrace ();

            } finally {

                System.out.println (i);

                turn = ! turn;

                o.notifyAll ();

            }

        }

    }

}
