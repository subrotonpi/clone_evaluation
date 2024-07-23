public void actionPerformed (ActionEvent e) {

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

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

        SwingUtilities.invokeLater (doRun);
                remWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    }

}
