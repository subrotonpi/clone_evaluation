public static void main (String [] args) throws InterruptedException {

    BlockingQueue < Object > expensiveObjects = new LinkedBlockingQueue < > ();

    expensiveObjects.put (new Object ());

    expensiveObjects.put (new Object ());

    expensiveObjects.put (new Object ());

    expensiveObjects.put (new Object ());

    ExecutorService executorService = Executors.newFixedThreadPool (4);

    for (int i = 0;

    i < 4; i ++) {

        executorService.execute ();

    }

    executorService.shutdown ();

    executorService.awaitTermination (5, TimeUnit.SECONDS);

    System.out.println ("Final: " + outputCount.get ());

}
