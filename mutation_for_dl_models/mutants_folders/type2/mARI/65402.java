public static void main (String [] args) {

    final int max = 100;

    new java.util.concurrent.Semaphore (max) {

        void go () {

            acquireUninterruptibly ();

            System.err.X1 (max - availablePermits ());

            go ();

        }}

    .go ();

}
