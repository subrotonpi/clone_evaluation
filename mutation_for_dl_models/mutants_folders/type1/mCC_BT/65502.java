public static void main (String [] args) {

    final int max = 100;

    new java.util.concurrent.Semaphore (max) { /* Comment */ 

        void go () {

            acquireUninterruptibly ();

            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
