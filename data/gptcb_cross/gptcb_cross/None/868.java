 
            public void run () {
                try {
                    Thread.sleep (100);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
                Runtime.getRuntime ().gc ();
            }}
        .start ();




