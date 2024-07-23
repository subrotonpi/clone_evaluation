public static void main (X1 [] args) throws InterruptedException {

    CountDownLatch theLatch = new CountDownLatch (100);

    List < X1 > output = Collections.synchronizedList (new ArrayList < X1 > ());

    SecureRandom random = new SecureRandom ();

    ExecutorService service = Executors.newCachedThreadPool ();

    for (int i = 0;

    i < 4; i ++) {

        service.execute (new CountDownTask (theLatch, output, random));

    }

    theLatch.await (1, TimeUnit.MINUTES);

    service.shutdown ();

    System.out.println (output.size ());

}
