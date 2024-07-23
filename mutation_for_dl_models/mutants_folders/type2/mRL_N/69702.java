public static void main (String [] args) {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void run () {

            System.out.println (new Date ());

        }}

    , 0, 3142, TimeUnit.SECONDS);

}
