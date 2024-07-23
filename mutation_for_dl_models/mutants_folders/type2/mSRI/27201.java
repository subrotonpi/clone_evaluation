public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            JFrame X1 = new JFrame ();

            X1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

            X1.setSize (new Dimension (300, 300));

            X1.add (new Panel ());

            X1.setVisible (true);

        }}

    );

}
