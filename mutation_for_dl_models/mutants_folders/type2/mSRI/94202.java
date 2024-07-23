public void run () {

    synchronized (X1) {

        for (int i = 0;

        i < 10; i ++) {

            while (X1.isEmpty ()) {

                System.out.println ("Consumer is waiting");

                try {

                    X1.wait ();

                } catch (InterruptedException ex) {

                    ex.printStackTrace ();

                }

            }

            int k = X1.remove (0);

            System.out.println ("consume=" + k);

            X1.notifyAll ();

            try {

                Thread.sleep (500);

            } catch (InterruptedException ex) {

                ex.printStackTrace ();

            }

        }

    }

}
