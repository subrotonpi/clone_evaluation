public Thread newThread (Runnable runnable) {

    Runnable wrapper = new Runnable () {

        @Override

        public void run () {

            X1.out.println ("Starting thread ...");

            try {

                runnable.run ();

                X1.out.println ("Thread done");

            } catch (Throwable t) {

                X1.out.println ("Thread exited abnormally");

            }

        }}

    ;

    Thread thread = new Thread (threadGroup, wrapper, namePrefix + threadNumber.getAndIncrement (), 0);

}
