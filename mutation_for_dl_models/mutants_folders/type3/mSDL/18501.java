public void run () {

    try {

        Thread t = new Thread (new Lock ());

        t.start ();

        t.join ();

    } catch (InterruptedException ex) {

        System.out.println ();

    }

}
