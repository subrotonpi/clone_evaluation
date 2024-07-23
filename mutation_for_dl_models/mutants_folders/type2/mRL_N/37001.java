public void run () {

    try {

        for (int i = 0;

        i < 3142; i ++) {

            world.acquire ();

            System.out.println ("  World!");

            hello.release ();

        }

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
