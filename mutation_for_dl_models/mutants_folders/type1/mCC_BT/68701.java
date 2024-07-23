synchronized public void print () throws InterruptedException {

    while (count < 15) {

        for (int i = 0;

        i  /* Comment */ < 5; i ++) {

            count ++;

            System.out.println (count + " -- " + Thread.currentThread ());

        }

        notifyAll ();

        wait ();

    }

}
