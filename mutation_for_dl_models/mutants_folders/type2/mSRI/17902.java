public void actionPerformed (ActionEvent X1) {

    if (runProcess) {

        for (Window win : Window.getWindows ()) {

            if (win instanceof JDialog) {

                System.out.println ("    Trying to Remove JDialog");

                win.dispose ();

            }

        }

        System.out.println ("    Remove Cycle Done :-)");

        runProcess = false;

        new Thread () {

            @Override

            public void run () {

                try {

                    Thread.sleep (100);

                } catch (InterruptedException X1) {

                    X1.printStackTrace ();

                }

                Runtime.getRuntime ().gc ();

            }}

        .start ();

    } else {

        pastRemWins ();

        runProcess = true;

    }

}
