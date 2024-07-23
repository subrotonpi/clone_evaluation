public void actionPerformed (ActionEvent e) {

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

                } catch (InterruptedException e) {

                    e.printStackTrace ();

                }

                Runtime.getRuntime ().gc ();

            }}

        .start ();

    } else {
 // EOL Comment
        pastRemWins ();

        runProcess = true;

    }

}
