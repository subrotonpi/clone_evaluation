public void run () {

    try {

        synchronized (lock) {

            for (int i = 0;

            i < 5; i ++) {

                while (X1 != token % N) lock.wait ();

                System.out.println (X1 + " " + i);

                token ++;

                lock.notifyAll ();

            }

        }

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
