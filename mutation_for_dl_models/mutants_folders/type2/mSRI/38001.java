public void run () {

    int emptyCycleCounter = 0;

    while (true) {

        int i = counter.get ();

        if (i > MAX_COUNTER) {

            break;

        }

        if (i % 2 == (X1 ? 1 : 0)) {

            System.out.println (i + (X1 ? " odd" : " even"));

            counter.incrementAndGet ();

        } else {

            emptyCycleCounter ++;

            Thread.yield ();

        }

    }

    System.out.println ("Finished" + (X1 ? " odd" : " even") + " with " + emptyCycleCounter + " empty cycles.");

}
