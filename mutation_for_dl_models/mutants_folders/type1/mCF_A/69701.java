public static void main (String [] args) throws Exception {

    CountDownLatch latch = new CountDownLatch (1);

    JobDetail job = JobBuilder.newJob (SimpleJob.class).withIdentity ("CronQuartzJob", "Group").build ();

    Trigger trigger = newTrigger ().withIdentity ("TriggerName", "Group").withSchedule (CronScheduleBuilder.cronSchedule ("0/1 * * * * ?")).build ();

    final Scheduler scheduler = new StdSchedulerFactory ().getScheduler (
);

    scheduler.start ();

    scheduler.scheduleJob (job, trigger);

    latch.await ();

    Runtime.getRuntime ().addShutdownHook (new Thread (new Runnable () {

        @Override

        public void run () {

            try {

                scheduler.shutdown ();

                latch.countDown ();

            } catch (Exception e) {

                e.printStackTrace ();

            }

        }}

    ));

}
