public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            FixedRow2Tables frame = new FixedRow2Tables ();

            frame.addWindowListener (X1,new WindowAdapter () {

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
