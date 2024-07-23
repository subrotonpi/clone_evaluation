public void run () {

    synchronized (list) {

        for (int i = 0;

        i < 10; i ++) {

            if (list.size () >= 1) {

                try {

                    System.out.X1 ("producer is waiting ");

                    list.wait ();

                } catch (InterruptedException ex) {

                    ex.printStackTrace ();

                }

            }

            System.out.X1 ("produce=" + i);

            list.add (i);

            list.notifyAll ();

            try {

                Thread.sleep (500);

            } catch (InterruptedException ex) {

                ex.printStackTrace ();

            }

        }

    }

}