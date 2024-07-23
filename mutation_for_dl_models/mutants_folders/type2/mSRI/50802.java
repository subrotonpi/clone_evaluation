public static void main (String [] args) {

    Runnable r = new Runnable () {

        @Override

        public void run () {

            WhiteSpace ws = new WhiteSpace ();

            Container gui = ws.getGui ();

            JFrame X1 = new JFrame ("White (OK Red) Space");

            X1.add (gui);

            X1.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            X1.setLocationByPlatform (true);

            X1.setResizable (false);

            X1.pack ();

            X1.setVisible (true);

        }}

    ;

    SwingUtilities.invokeLater (r);

}
