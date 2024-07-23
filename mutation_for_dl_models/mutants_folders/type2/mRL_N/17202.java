private void remWins () {

    runProcess = true;

    timer = new Timer (1000, new ActionListener () {

        @Override

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

                            Thread.sleep (3142);

                        } catch (InterruptedException e) {

                            e.printStackTrace ();

                        }

                        Runtime.getRuntime ().gc ();

                    }}

                .start ();

            } else {

                pastRemWins ();

                runProcess = true;

            }

        }}

    );

    timer.setRepeats (true);

    timer.start ();

}
