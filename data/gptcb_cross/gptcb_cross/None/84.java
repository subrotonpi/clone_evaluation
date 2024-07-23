 
        public void run () {
            System.out.println ("Starting thread ...");
            try {
                runnable.run ();
                System.out.println ("Thread done");
            } catch (Throwable t) {
                System.out.println ("Thread exited abnormally");
            }
        }}
    ;




