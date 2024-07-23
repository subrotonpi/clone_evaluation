public static void main (String [] args) throws InterruptedException {

    MyThread X1 = new MyThread ();

    X1.hello = hello;

    X1.world = world;

    X1.start ();

    for (int i = 0;

    i < 5; i ++) {

        hello.acquire ();

        System.out.println ("Hello");

        world.release ();

    }

}
