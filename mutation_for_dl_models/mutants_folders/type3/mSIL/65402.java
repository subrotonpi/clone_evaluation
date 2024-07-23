public static void main (X1,String [] args) {

    final int max = 100;

    new java.util.concurrent.Semaphore (max) {

        void go () {

            acquireUninterruptibly ();

            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
