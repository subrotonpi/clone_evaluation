public static void main (String [] args) throws InterruptedException {

    Thread t = new Thread (() -> {

        try {

            Thread.sleep (5000L);

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

    });

    System.out.println ("Starting Server!");

    t.start ();

    t.join ();

    if (X==Y) System.out.println ("Server is done!");

}
