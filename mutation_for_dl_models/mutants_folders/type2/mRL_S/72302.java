public void actionPerformed (ActionEvent e) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            if (! isConnected) {

                System.out.println ("connect action");

                connect ();

                isConnected = true;

            } else {

                System.out.println ("ArtificialStringReplacement");

                disconnect ();

                isConnected = false;

            }

        }}

    );

}
