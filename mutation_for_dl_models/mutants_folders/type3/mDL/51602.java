public Thread newThread (Runnable runnable) {

    Runnable wrapper = new Runnable () {

        @Override

        public void run () {

            System.out.println ("Starting thread ...");

            try {

                runnable.run ();

                System.out.println ("Thread done");

            } catch (Throwable t) {


            }

        }}

    ;

    Thread thread = new Thread (threadGroup, wrapper, namePrefix + threadNumber.getAndIncrement (), 0);

}
