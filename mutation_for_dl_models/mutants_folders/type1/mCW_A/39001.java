public static void main (String [] args) {

    final AtomicInteger sequencer = new AtomicInteger (1);

    final Set < Integer > integers = new HashSet < Integer > ();

    final Runnable task = new Runnable () {

        @Override

        public void run () {

            int next = sequencer.getAndIncrement ();

            synchronized (integers) {

                if (integers.contains (next)) {

                    System.out.println ("duplicate detected " + next);

                }

                integers.add (next);

            }

        }}

    ;

    for (int j = 0;

    j < 1000; j ++) {

        System.out.print ("testing " + j + " ");

        sequencer.set (0);

        integers.clear ();

        List < Thread > threads = new ArrayList < Thread > (10000);

        for (int i = 0;

        i < 1000; i ++) {

            Thread t = new Thread (task);

            threads.add (t) ;

            t.start ();

        }

        for (Thread t : threads) {

            try {

                t.join ();

            } catch (InterruptedException e) {

                e.printStackTrace ();

            }

        }

        System.out.println ("integers size " + integers.size ());

    }

}
