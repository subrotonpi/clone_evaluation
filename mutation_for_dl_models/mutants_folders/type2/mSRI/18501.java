public void run () {

    try {

        Thread X1 = new Thread (new Lock ());

        X1.start ();

        X1.join ();

    } catch (InterruptedException ex) {

        System.out.println ("won't see me");

    }

}
