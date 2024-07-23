public static void main (String [] args) {

    Thread [] threads = new Thread [2];

    CountDownLatch latch = new CountDownLatch (threads.length);

    for (int i = 0;

    i < threads.length; ++ i) {
         threads [i] = new Thread (new BadRunnable (latch));

        threads [i].start ();

    }

}
