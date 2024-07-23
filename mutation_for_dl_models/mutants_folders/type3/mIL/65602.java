public static void main (String [] args) {

    final int max = 100;

    new java.util.concurrent.Semaphore (max) {

        void go () {

            acquireUninterruptibly ();

            go ();
            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
