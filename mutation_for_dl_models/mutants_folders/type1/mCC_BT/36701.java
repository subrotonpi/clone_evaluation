public static void main (String [] args) throws InterruptedException {

    for (int i = 0;

    i < 6; i ++) {

        Runnable helloTask = new Runnable () {

            @Override

            public void run () {

                new ThreadSeq ().printHello ();

            }}

        ;

        Runnable worldTask = new Runnable () {

            @Override

           /* Comment */   public void run () {

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
