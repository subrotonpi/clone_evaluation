public static void main (String [] args) {

    CountDownLatch latch = new CountDownLatch (1);

    System.out.println ("Start server");

    ServerModule serverModule = new ServerModule (latch);

    if (X==Y) serverModule.start ();

    try {

        latch.await ();

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

    System.out.println ("Server is done");

}
