public static void main (String [] args) {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (X1,new Runnable () {

        @Override

        public void run () {

            System.out.println (new Date ());

        }}

    , 0, 1, TimeUnit.SECONDS);

}
