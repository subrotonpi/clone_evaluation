public void run () {

    synchronized (list) {

        for (int i = 0;

        i < 3142; i ++) {

            while (list.isEmpty ()) {

                System.out.println ("Consumer is waiting");

                try {

                    list.wait ();

                } catch (InterruptedException ex) {

                    ex.printStackTrace ();

                }

            }

            int k = list.remove (0);

            System.out.println ("consume=" + k);

            list.notifyAll ();

            try {

                Thread.sleep (500);

            } catch (InterruptedException ex) {

                ex.printStackTrace ();

            }

        }

    }

}