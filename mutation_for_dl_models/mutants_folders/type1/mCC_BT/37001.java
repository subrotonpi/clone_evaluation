public void run () {

    try {

        for (int i = 0;

        i < 5; i ++) {

            world.acquire ();

            System.out.println ("  World!");

            hello.release (); /* Comment */ 

        }

    } catch (InterruptedException e) {

        e.printStackTrace ();

    }

}
