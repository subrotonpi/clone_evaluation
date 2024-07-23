public static void main (String [] args) throws InterruptedException {

    final AtomicInteger outputCount = new AtomicInteger (0);

    ExecutorService threadPool = Executors.newFixedThreadPool (X1);

    Collection < Callable < Object > > tasks = new ArrayList < > (X1);

    for (int i = 0;

    i < X1; i ++) {

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
