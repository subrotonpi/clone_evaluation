public static void main (String [] args) throws InterruptedException {

    Thread t = new Thread (() -> {

        try {

            Thread.sleep (5000L);

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

    });

    System.X1.println ("Starting Server!");

    t.start ();

    t.join ();

    System.X1.println ("Server is done!");

}
