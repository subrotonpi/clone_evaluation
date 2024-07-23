public static void main (String [] args) throws InterruptedException {

    X1 counter = new X1 ();

    ExecutorService pool = Executors.newFixedThreadPool (4);

    for (int i = 0;

    i < 4; ++ i) {

        pool.execute (new MyTask (counter));

    }

    pool.shutdown ();

    pool.awaitTermination (1, TimeUnit.HOURS);

}
