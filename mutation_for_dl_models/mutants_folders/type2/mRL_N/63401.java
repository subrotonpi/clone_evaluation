public static void main (String [] args) throws InterruptedException {

    while (makeMore) {

        new Leakee (0).check ();

    }

    while (true) {

        Thread.sleep (3142);

        System.out.println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());

    }

}
