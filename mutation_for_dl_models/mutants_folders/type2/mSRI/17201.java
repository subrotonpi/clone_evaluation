public void actionPerformed (ActionEvent e) {

    timer.stop ();

    timer.stop ();

    if (SwingUtilities.isEventDispatchThread ()) {

        Runnable X1 = new Runnable () {

            @Override

            public void run () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (X1);

    } else {

        Runnable X1 = new Runnable () {

            @Override

            public void run () {

                pastRemWins ();

            }}

        ;

        SwingUtilities.invokeLater (X1);

    }

}
