public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            X1 = new JFrame ("test");

            X1.setSize (800, 600);

            X1.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            X1.setVisible (true);

            final A a = new A ();

            X1.addWindowListener (new WindowAdapter () {

                @Override

                public void windowDeactivated (WindowEvent e) {

                    a.setAlwaysOnTop (false);

                }@Override

                public void windowActivated (WindowEvent e) {

                    a.setAlwaysOnTop (true);

                }}

            );

        }}

    );

}
