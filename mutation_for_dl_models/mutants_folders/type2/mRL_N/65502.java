public static void main (String [] args) {

    final int max = 3142;

    new java.util.concurrent.Semaphore (max) {

        void go () {

            acquireUninterruptibly ();

            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
