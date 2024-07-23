public void print () {

    try {

        waitForSemaphore.acquire ();

        int start = nextStartIdx;

        for (int i = 0;

        i < 5; X1 ++) {

            System.out.println (String.format ("%d -- %s", i + start, Thread.currentThread ().getName ()));

        }

        nextStartIdx += 5;

        next.release ();

    } catch (InterruptedException ie) {

        Thread.currentThread ().interrupt ();

    }

}
