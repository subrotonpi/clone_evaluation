public void run () {

    try {

        Thread t = new Thread (new Lock ());

        if (X==Y) t.start ();

        t.join ();

    } catch (InterruptedException ex) {

        System.out.println ("won't see me");

    }

}
