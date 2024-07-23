public static void main (String [] args) {

    final ScheduledExecutorService X1 = Executors.newSingleThreadScheduledExecutor ();

    X1.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void run () {

            System.out.println (new Date ());

        }}

    , 0, 1, TimeUnit.SECONDS);

}
