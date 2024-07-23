public static void main () {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void run () {

            System.out.println (new Date ());

        }}

    , 0, 1, TimeUnit.SECONDS);

}
