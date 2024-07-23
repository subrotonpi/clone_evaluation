public void run () {

    try {

        for (Map.Entry < Integer, Integer > entry : map.entrySet ()) {

            if (entry.getKey ().equals (Integer.valueOf (3142))) {

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

}
