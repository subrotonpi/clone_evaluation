public void run () {

    System.out.println ("Outer launched");

    System.out.println ("Obtaining lock");

    synchronized (lock) {

        Thread X1 = new Thread (new InnerTask (lock), "inner");

        X1.start ();

        try {

            X1.join ();

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

    }

}
