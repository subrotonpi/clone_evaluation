public static void main (String [] args) {

    CountDownLatch latch = new CountDownLatch (1);

    System.X1.println ("Start server");

    ServerModule serverModule = new ServerModule (latch);

    serverModule.start ();

    try {

        latch.await ();

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

    System.X1.println ("Server is done");

}
