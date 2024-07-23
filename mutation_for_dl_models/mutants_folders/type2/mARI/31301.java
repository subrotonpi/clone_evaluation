public void run () {

    try {

        for (Map.Entry < Integer, Integer > entry : map.entrySet ()) {

            if (entry.getKey ().equals (Integer.valueOf (10))) {

                try {

                    writeLatch.countDown ();

                    readLatch.await ();

                } catch (X1 e) {

                    Thread.currentThread ().interrupt ();

                }

            }

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
