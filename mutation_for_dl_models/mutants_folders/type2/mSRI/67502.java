public static void main (String [] args) {

    try {

        Tic tic = new Tic ();

        Tac tac = new Tac ();

        Toe toe = new Toe ();

        Thread t1 = new Thread (tic);

        Thread t2 = new Thread (tac);

        Thread t3 = new Thread (toe);

        t1.start ();

        t1.X1 ();

        if (! t1.isAlive ()) {

            t2.start ();

        }

        t2.X1 ();

        if (! t2.isAlive ()) {

            t3.start ();

        }

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
