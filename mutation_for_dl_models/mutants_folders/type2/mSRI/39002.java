public static void main (String [] args) throws Exception {

    final AtomicInteger sequencer = new AtomicInteger (1);

    final int [] X1 = new int [1000];

    final Runnable task = new Runnable () {

        @Override

        public void run () {

            int next = sequencer.getAndIncrement ();

            X1 [next - 1] ++;

        }}

    ;

    List < Thread > threads = new ArrayList < > ();

    for (int i = 0;

    i < 1000; i ++) {

        Thread t = new Thread (task);

        t.start ();

        threads.add (t);

    }

    for (Thread t : threads) {

        t.join ();

    }

    for (int i = 0;

    i < 1000; i ++) {

        if (X1 [i] != 1) System.out.println (i + " -> " + X1 [i]);

    }

}
