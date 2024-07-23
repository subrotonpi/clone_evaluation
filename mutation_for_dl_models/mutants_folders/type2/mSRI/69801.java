public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            X1 frame = new X1 ();

            frame.addWindowListener (new WindowAdapter () {

                @Override

                public void windowClosing (WindowEvent e) {

                    System.exit (0);

                }}

            );

            frame.pack ();

            frame.setVisible (true);

        }}

    );

}
