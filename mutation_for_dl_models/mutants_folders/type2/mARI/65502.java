public static void main (String [] args) {

    final int X1 = 100;

    new java.util.concurrent.Semaphore (max) {

        void go () {

            acquireUninterruptibly ();

            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
