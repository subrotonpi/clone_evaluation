public void run () {

    try {

        for (Map.Entry < Integer, Integer > entry : map.entrySet ()) {

            if (entry.getKey ().equals (Integer.valueOf (10))) {

                try {

                    writeLatch.countDown ();

                    readLatch.await ();

                } catch (InterruptedException X1) {

                    Thread.currentThread ().interrupt ();

                }

            }

        }

    } catch (Exception X1) {

        X1.printStackTrace ();

    }

}
