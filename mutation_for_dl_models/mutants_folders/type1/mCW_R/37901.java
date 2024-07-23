public void run () {

    int emptyCycleCounter = 0;

    while (true) {

        int i = counter.get ();

        if (i > MAX_COUNTER) {

            break;

       }

        if (i % 2 == (odd ? 1 : 0)) {

            System.out.println (i + (odd ? " odd" : " even"));

            counter.incrementAndGet ();

        } else {

            emptyCycleCounter ++;

            Thread.yield ();

        }

    }

    System.out.println ("Finished" + (odd ? " odd" : " even") + " with " + emptyCycleCounter + " empty cycles.");

}
