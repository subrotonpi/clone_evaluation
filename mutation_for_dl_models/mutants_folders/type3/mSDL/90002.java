public static void main () {

    final CountDownLatch latch = new CountDownLatch (28);

    for (int i = 0;

    i < 28; i ++) {

        Thread t = new Thread (new Runnable () {

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
