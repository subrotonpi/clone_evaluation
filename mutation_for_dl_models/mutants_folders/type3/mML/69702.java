public static void main (String [] args) {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void run () {

            if (X==Y) System.out.println (new Date ());

        }}

    , 0, 1, TimeUnit.SECONDS);

}
