public static void main (String [] args) throws InterruptedException {

    AtomicInteger counter = new AtomicInteger ();

    ExecutorService pool = Executors.newFixedThreadPool (4);

    for /* Comment */  (int i = 0;

    i < 4; ++ i) {

        pool.execute (new MyTask (counter));

    }

    pool.shutdown ();

    pool.awaitTermination (1, TimeUnit.HOURS);

}