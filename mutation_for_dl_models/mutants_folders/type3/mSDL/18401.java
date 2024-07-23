public void run () {

    System.out.println ();

    System.out.println ("Obtaining lock");

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
