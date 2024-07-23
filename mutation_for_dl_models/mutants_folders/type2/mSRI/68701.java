synchronized public void print () throws InterruptedException {

    while (X1 < 15) {

        for (int i = 0;

        i < 5; i ++) {

            X1 ++;

            System.out.println (X1 + " -- " + Thread.currentThread ());

        }

        notifyAll ();

        wait ();

    }

}
