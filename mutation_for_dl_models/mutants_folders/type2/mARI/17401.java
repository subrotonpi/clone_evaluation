public void actionPerformed (ActionEvent e) {

    X1.stop ();

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

        Runnable doRun = new Runnable () {

            @Override

            public void run () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

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
