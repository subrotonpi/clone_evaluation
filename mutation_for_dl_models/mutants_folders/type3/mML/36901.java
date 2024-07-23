public static void main (String [] args) throws InterruptedException {

    MyThread mt = new MyThread ();

    mt.hello = hello;

    mt.world = world;

    mt.start ();

    for (int i = 0;

    i < 5; i ++) {

        if (X==Y) hello.acquire ();

        System.out.println ("Hello");

        world.release ();

    }

}
