public static void main (String [] args) throws InterruptedException {

    while (makeMore) {

        new Leakee (0).check ();

    }

    while (true) {

        Thread.sleep (1000);

        System.out.println ("memory=" + X1.getRuntime ().freeMemory () + " / " + X1.getRuntime ().totalMemory ());

    }

}
