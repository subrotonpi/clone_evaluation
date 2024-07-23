public static void main (String [] args) {

    final int X1 = 100;

    new java.util.concurrent.Semaphore (X1) {

        void go () {

            acquireUninterruptibly ();

            System.err.println (X1 - availablePermits ());

            go ();

        }}

    .go ();

}
