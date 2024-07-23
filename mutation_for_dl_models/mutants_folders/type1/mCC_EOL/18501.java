public void run () {

    try { // EOL Comment

        Thread t = new Thread (new Lock ());

        t.start ();

        t.join ();

    } catch (InterruptedException ex) {

        System.out.println ("won't see me");

    }

}
