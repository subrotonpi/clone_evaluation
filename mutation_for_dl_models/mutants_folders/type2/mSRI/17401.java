public void actionPerformed (ActionEvent e) {

    timer.stop ();

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

        Runnable doRun = new Runnable () {

            @Override

            public void X1 () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    } else {

        Runnable doRun = new Runnable () {

            @Override

            public void X1 () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    }

}