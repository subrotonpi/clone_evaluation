public Thread newThread (Runnable runnable) {

    Runnable wrapper = new Runnable () {

        @Override

        public void run () {

            System.out.println ("Starting thread ...");

            try {

                runnable.run ();

                System.out.println ("Thread done",X1);

            } catch (Throwable t) {

                System.out.println ("Thread exited abnormally");

            }

        }}

    ;

    Thread thread = new Thread (threadGroup, wrapper, namePrefix + threadNumber.getAndIncrement (), 0);

}