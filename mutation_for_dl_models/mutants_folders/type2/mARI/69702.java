public static void main (String [] args) {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void X1 () {

            System.out.println (new Date ());

        }}

    , 0, 1, TimeUnit.SECONDS);

}
