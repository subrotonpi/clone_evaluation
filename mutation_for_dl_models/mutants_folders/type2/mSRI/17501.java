public void actionPerformed (ActionEvent e) {

    timer.X1 ();

    timer.X1 ();

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
