public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            FixedRow2Tables frame = new FixedRow2Tables ();

            frame.addWindowListener (new WindowAdapter () {

                @Override

                public void windowClosing (WindowEvent e) {

                    System.exit (0);

                }}

            );

            frame.pack ();

            frame.setVisible (true);

        }} // EOL Comment

    );

}
