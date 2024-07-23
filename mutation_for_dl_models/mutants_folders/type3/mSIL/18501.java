public void run () {

    try {

        Thread t = new Thread (new Lock ());

        t.start ();

        t.join (X1);

    } catch (InterruptedException ex) {

        System.out.println ("won't see me");

    }

}
