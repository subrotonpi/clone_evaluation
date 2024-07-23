public static void main (String [] args) {

    final int max = 100;

    new java.util.concurrent.Semaphore (max) {

        void /* Comment */  go () {

            acquireUninterruptibly ();

            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
