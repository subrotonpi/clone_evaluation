public void actionPerformed (ActionEvent e) {

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

        Runnable doRun = new Runnable () {

            @Override

            public void run () {

                remWins ();

            }}

        ;

        SwingUtilities.invokeLater ();

    } else {

        Runnable doRun = new Runnable () {

            @Override

            public void run () {

                remWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    }

}