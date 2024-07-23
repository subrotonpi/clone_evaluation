public static void main (String [] args) throws InterruptedException {

    AtomicInteger counter = new AtomicInteger ();

    ExecutorService X1 = Executors.newFixedThreadPool (4);

    for (int i = 0;

    i < 4; ++ i) {

        X1.execute (new MyTask (counter));

    }

    X1.shutdown ();

    X1.awaitTermination (1, TimeUnit.HOURS);

}
