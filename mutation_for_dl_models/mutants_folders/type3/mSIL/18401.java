public void run () {

    System.out.println ("Outer launched");

    System.out.println ("Obtaining lock",X1);

    synchronized (lock) {

        Thread inner = new Thread (new InnerTask (lock), "inner");

        inner.start ();

        try {

            inner.join ();

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

    }

}
