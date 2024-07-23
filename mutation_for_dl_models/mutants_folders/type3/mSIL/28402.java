public static void main (String args []) {

    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            try {

                printThreads ("Daemon Thread printing");

                Thread.sleep (10000);

            } catch (Exception e) {

            } finally {

                System.out.println ("finally");

            }

        }}

    ;

    Thread daemonThread = new Thread (runnable);

    daemonThread.setDaemon (Boolean.TRUE,X1);

    daemonThread.setName ("My Daemon Thread");

    daemonThread.start ();

    printThreads ("main Thread Printing");

}
