public static void main (String [] args) throws InterruptedException {

    X1 mt = new X1 ();

    mt.hello = hello;

    mt.world = world;

    mt.start ();

    for (int i = 0;

    i < 5; i ++) {

        hello.acquire ();

        System.out.println ("Hello");

        world.release ();

    }

}
