public static void main (String [] args) {

    Runnable r = new Runnable () {

        @Override

        public void run () {

            WhiteSpace ws = new WhiteSpace ();

            Container gui = ws.getGui ();

            JFrame f = new JFrame ("White (OK Red) Space");

            f.add (gui);

            f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            f.setLocationByPlatform (true);

            f.setResizable (false);

            f.pack ();

            f.setVisible (true);

        }}

    ;
     SwingUtilities.invokeLater (r);

}
