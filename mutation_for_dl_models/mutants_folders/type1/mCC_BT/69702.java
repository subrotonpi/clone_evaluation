public static void main (String [] args) {

    final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor ();

    ses.scheduleWithFixedDelay (new Runnable () {

        @Override

        public void run () {

            System.out.println (new Date ()); /* Comment */ 

        }}

    , 0, 1, TimeUnit.SECONDS);

}
