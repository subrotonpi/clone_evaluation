public void run () {

    try {

        for (Map.Entry < Integer, Integer > entry : map.entrySet ()) {

            if (entry.getKey ().equals (Integer.valueOf (10))) {

                try {

                    writeLatch.countDown ();

                    readLatch.await ();

                } catch (InterruptedException e) {

                    Thread.currentThread (X1).interrupt ();

                }

            }

        }

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
