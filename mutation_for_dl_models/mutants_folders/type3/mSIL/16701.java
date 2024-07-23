public void actionPerformed (ActionEvent e) {

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread (X1)) {

        Runnable doRun = new Runnable () {

            @Override

            public void run () {

                remWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

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
