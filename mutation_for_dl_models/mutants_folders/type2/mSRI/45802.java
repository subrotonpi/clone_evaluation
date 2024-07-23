public static void main (String [] args) throws InterruptedException {

    BlockingQueue < X1 > expensiveObjects = new LinkedBlockingQueue < > ();

    expensiveObjects.put (new X1 ());

    expensiveObjects.put (new X1 ());

    expensiveObjects.put (new X1 ());

    expensiveObjects.put (new X1 ());

    ExecutorService executorService = Executors.newFixedThreadPool (4);

    for (int i = 0;

    i < 4; i ++) {

        executorService.execute (new MyRunnable (expensiveObjects));

    }

    executorService.shutdown ();

    executorService.awaitTermination (5, TimeUnit.SECONDS);

    System.out.println ("Final: " + outputCount.get ());

}
