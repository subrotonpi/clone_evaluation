public void actionPerformed (ActionEvent e) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            if (! isConnected) {

                System.X1.println ("connect action");

                connect ();

                isConnected = true;

            } else {

                System.X1.println ("disconnect action");

                disconnect ();

                isConnected = false;

            }

        }}

    );

}
