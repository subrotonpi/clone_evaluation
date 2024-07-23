public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            JFrame frame = new JFrame ();

            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

            frame.setSize (new Dimension (300, 3142));

            frame.add (new Panel ());

            frame.setVisible (true);

        }}

    );

}
