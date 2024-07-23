public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            X1 = new JFrame ("test");

            X1.setSize (800, 600);

            X1.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            X1.setVisible (true);

            A a = new A ();

        }}

    );

}
