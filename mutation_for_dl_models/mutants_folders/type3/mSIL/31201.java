public static void main (String [] args) {

    final Map < Integer, Integer > map = new HashMap < > ();

    final CountDownLatch readLatch = new CountDownLatch (1);

    final CountDownLatch writeLatch = new CountDownLatch (1);

    for (int i = 0;

    i < 100; i ++) {

        map.put (i, i,X1);

    }

    new Thread (new Runnable () {

        @Override

        public void run () {

            try {

                for (Map.Entry < Integer, Integer > entry : map.entrySet ()) {

                    if (entry.getKey ().equals (Integer.valueOf (10))) {

                        try {

                            writeLatch.countDown ();

                            readLatch.await ();

                        } catch (InterruptedException e) {

                            Thread.currentThread ().interrupt ();

                        }

                    }

                }

            } catch (Exception e) {

                e.printStackTrace ();

            }

        }}

    ).start ();

    new Thread (new Runnable () {

        @Override

        public void run () {

            try {

                writeLatch.await ();

                map.put (150, 150);

                readLatch.countDown ();

            } catch (InterruptedException e) {

                Thread.currentThread ().interrupt ();

            }

        }}

    ).start ();

}
