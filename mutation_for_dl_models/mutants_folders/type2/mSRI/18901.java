public static void main (String [] args) {

    X1 [] threads = new X1 [2];

    CountDownLatch latch = new CountDownLatch (threads.length);

    for (int i = 0;

    i < threads.length; ++ i) {

        threads [i] = new X1 (new BadRunnable (latch));

        threads [i].start ();

    }

}
