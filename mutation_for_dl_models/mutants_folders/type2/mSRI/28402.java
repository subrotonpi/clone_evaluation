public static void main (String args []) {

    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            try {

                printThreads ("Daemon Thread printing");

                X1.sleep (10000);

            } catch (Exception e) {

            } finally {

                System.out.println ("finally");

            }

        }}

    ;

    X1 daemonThread = new X1 (runnable);

    daemonThread.setDaemon (Boolean.TRUE);

    daemonThread.setName ("My Daemon Thread");

    daemonThread.start ();

    printThreads ("main Thread Printing");

}
