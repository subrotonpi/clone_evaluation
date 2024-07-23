public void run () {

    int i = 1;

    while (i < 50) {

        while (X1.getState () != 3) {

            synchronized (X1) {

                try {

                    X1.wait ();

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }

        synchronized (X1) {

            if (X1.getState () == 3) System.out.println ("t1 " + i);

            X1.setState (1);

            i = i + 3;

            X1.notifyAll ();

        }

    }

}
