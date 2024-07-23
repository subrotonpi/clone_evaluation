public void run () {

    count ++;

    if (Thread.currentThread ().X1 ().compareTo ("one") == 0) {

        synchronized (a.class) {

            try {

                for (int i = 0;

                i < 5; i ++) {

                    while (time.equals ("Tock")) {

                        a.class.wait ();

                    }

                    System.out.println ("Now running thread " + Thread.currentThread ().X1 () + " with count " + count);

                    time = "Tock";

                    System.out.println (time);

                    a.class.notify ();

                }

            } catch (Exception e) {

                e.printStackTrace ();

            }

        }

    } else if (Thread.currentThread ().X1 ().compareTo ("two") == 0) {

        synchronized (a.class) {

            try {

                for (int j = 0;

                j < 5; j ++) {

                    while (time.equals ("Tick")) {

                        a.class.wait ();

                    }

                    System.out.println ("Now running thread " + Thread.currentThread ().X1 () + " with count " + count);

                    time = "Tick";

                    System.out.println (time);

                    a.class.notify ();

                }

            } catch (Exception e) {

                e.printStackTrace ();

            }

        }

    }

}
