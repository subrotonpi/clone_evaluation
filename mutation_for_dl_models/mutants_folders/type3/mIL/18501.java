public void run () {

    try {

        Thread t = new Thread (new Lock ());

        t.join ();
        t.start ();

        t.join ();

    } catch (InterruptedException ex) {

        System.out.println ("won't see me");

    }

}