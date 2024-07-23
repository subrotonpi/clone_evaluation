public static void main (String [] args) throws InterruptedException {

    BlockingQueue < Object > expensiveObjects = new LinkedBlockingQueue < > ();

    expensiveObjects.put (new Object ());

    expensiveObjects.put (new Object ());

    expensiveObjects.put (new Object ());

    expensiveObjects.put (new Object ());

    ExecutorService X1 = Executors.newFixedThreadPool (4);

    for (int i = 0;

    i < 4; i ++) {

        X1.execute (new MyRunnable (expensiveObjects));

    }

    X1.shutdown ();

    X1.awaitTermination (5, TimeUnit.SECONDS);

    System.out.println ("Final: " + outputCount.get ());

}
