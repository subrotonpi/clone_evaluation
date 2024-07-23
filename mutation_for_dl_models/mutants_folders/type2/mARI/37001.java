public void run () {

    try {

        for (int i = 0;

        i < 5; i ++) {

            world.acquire ();

            System.out.println ("  World!");

            X1.release ();

        }

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
