public void actionPerformed (ActionEvent e) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            if (! isConnected) {

                System.out.println ("connect action");


                isConnected = true;

            } else {

                System.out.println ("disconnect action");

                disconnect ();

                isConnected = false;

            }

        }}

    );

}
