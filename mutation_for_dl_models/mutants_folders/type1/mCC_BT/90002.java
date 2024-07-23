public static void main (String...args) {

    final CountDownLatch latch = new CountDownLatch (28);

    for (int i = 0;

    i < 28; i ++) {

        Thread t = new Thread (new /* Comment */  Runnable () {

            public void run () {

                try {

                } finally {

                    latch.countDown ();

                }

            }}

        );

        t.start ();

    }

    latch.await ();

}
