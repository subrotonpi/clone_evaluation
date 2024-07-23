public static void main (String [] args) throws InterruptedException {

    AtomicInteger counter = new AtomicInteger ();

    ExecutorService pool = Executors.newFixedThreadPool (4);

    for (int X1 = 0;

    X1 < 4; ++ X1) {

        pool.execute (new MyTask (counter));

    }

    pool.shutdown ();

    pool.awaitTermination (1, TimeUnit.HOURS);

}
