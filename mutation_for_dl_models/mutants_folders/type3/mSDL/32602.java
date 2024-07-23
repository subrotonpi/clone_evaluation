public void run () {

    try {

        synchronized (lock) {

            for (int i = 0;

            i < 5; i ++) {

                while (id != token % N) lock.wait ();

                System.out.println ();

                token ++;

                lock.notifyAll ();

            }

        }

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
