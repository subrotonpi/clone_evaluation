public void actionPerformed () {

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

                remWins ();

            }}

        ;

        SwingUtilities.invokeLater (doRun);

    }

}
