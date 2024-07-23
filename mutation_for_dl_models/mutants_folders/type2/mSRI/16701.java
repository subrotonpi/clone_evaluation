public void actionPerformed (ActionEvent e) {

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

        X1 doRun = new X1 () {

            @Override

            public void run () {

                remWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    } else {

        X1 doRun = new X1 () {

            @Override

            public void run () {

                remWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    }

}
