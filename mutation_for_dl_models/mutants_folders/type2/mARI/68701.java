synchronized public void print () throws InterruptedException {

    while (count < 15) {

        for (int X1 = 0;

        i < 5; i ++) {

            count ++;

            System.out.println (count + " -- " + Thread.currentThread ());

        }

        notifyAll ();

        wait ();

    }

}
