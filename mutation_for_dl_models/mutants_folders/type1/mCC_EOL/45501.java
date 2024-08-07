public static void main (String [] args) throws InterruptedException {

    final AtomicInteger outputCount = new AtomicInteger (0); // EOL Comment

    ExecutorService threadPool = Executors.newFixedThreadPool (THREADS);

    Collection < Callable < Object > > tasks = new ArrayList < > (THREADS);

    for (int i = 0;

    i < THREADS; i ++) {

        tasks.add (new Callable < Object > () {

            private SecureRandom rand = new SecureRandom ();

            private String task () {

                return rand.nextDouble () > 0.5 ? Thread.currentThread ().getName () : null;

            }@Override

            public Object call () {

                for (int i;

                (i = outputCount.get ()) < TASKS;) {

                    String output = task ();

                    if (output != null) {

                        if ((i = outputCount.incrementAndGet ()) < TASKS) {

                            System.out.println (output + ": " + i);

                        }

                    }

                }

                return null;

            }}

        );

    }

    threadPool.invokeAll (tasks);

    threadPool.shutdownNow ();

    System.out.println ("done");

}
