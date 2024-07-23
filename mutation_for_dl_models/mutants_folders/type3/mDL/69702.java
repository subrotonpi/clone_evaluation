public static void main (String [] args) {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void run () {


        }}

    , 0, 1, TimeUnit.SECONDS);

}
