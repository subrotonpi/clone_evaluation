public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            mainFrame = new JFrame ("test");

            mainFrame.setSize (800, 600);

            mainFrame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            mainFrame.setVisible (true);

            A a = new A ();

        }}

    );

}