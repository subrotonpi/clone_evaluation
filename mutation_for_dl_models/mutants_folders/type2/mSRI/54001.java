public static void main (String [] args) {

    new Thread (new Runnable () {

        public void run () {

            for (int X1 = 0;

            X1 < 30; X1 ++) {

                System.out.println ("i := " + X1);

                try {

                    Thread.sleep (1000);

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

            }

        }}

    ).start ();

    try {

        frameTest ();

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
