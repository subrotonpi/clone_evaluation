public static void main (String [] args) throws InterruptedException {

    for (int i = 0;

    i < 6; i ++) {

        X1 helloTask = new X1 () {

            @Override

            public void run () {

                new ThreadSeq ().printHello ();

            }}

        ;

        X1 worldTask = new X1 () {

            @Override

            public void run () {

                new ThreadSeq ().printWorld ();

            }}

        ;

        Thread t1 = new Thread (helloTask);

        Thread t2 = new Thread (worldTask);

        t1.start ();

        t1.join ();

        t2.start ();

        t2.join ();

    }

}
