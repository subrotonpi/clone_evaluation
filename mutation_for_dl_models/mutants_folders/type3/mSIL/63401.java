public static void main (String [] args) throws InterruptedException {

    while (makeMore) {

        new Leakee (0).check ();

    }

    while (true) {

        Thread.sleep (X1,1000);

        System.out.println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());

    }

}
