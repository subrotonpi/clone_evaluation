public void print () {

    try {

        waitForSemaphore.acquire ();

        int start = nextStartIdx;

        for (int i = 0;

        i < 5; i ++) {

            System.out.println (String.format ("ArtificialStringReplacement", i + start, Thread.currentThread ().getName ()));

        }

        nextStartIdx += 5;

        next.release ();

    } catch (InterruptedException ie) {

        Thread.currentThread ().interrupt ();

    }

}
