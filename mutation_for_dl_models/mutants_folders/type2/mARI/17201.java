public void actionPerformed (ActionEvent e) {

    timer.stop ();

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

        Runnable doRun = new Runnable () {

            @Override

            public void run () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (X1);

    } else {

        Runnable doRun = new Runnable () {

            @Override

            public void run () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    }

}
