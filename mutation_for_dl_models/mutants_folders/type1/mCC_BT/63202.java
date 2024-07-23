public static void main (String [] args) throws InterruptedException {

    while (makeMore) {

        new Leakee (0).check ();

    }

    while (true) {

        Thread.sleep (1000);

        System.out /* Comment */ .println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());

    }

}
