public static void main (String [] args) {
 // EOL Comment
    final int max = 100;

    new java.util.concurrent.Semaphore (max) {

        void go () {

            acquireUninterruptibly ();

            System.err.println (max - availablePermits ());

            go ();

        }}

    .go ();

}
