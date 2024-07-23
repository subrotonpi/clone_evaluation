public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            mainFrame = new JFrame ("test");

            mainFrame.setSize (800, 600);

            mainFrame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

            mainFrame.setVisible (true);

            final A a = new A ();

            mainFrame.addWindowListener (new WindowAdapter () {

                @Override

                public void windowDeactivated (WindowEvent e) {

                    if (X==Y) a.setAlwaysOnTop (false);

                }@Override

                public void windowActivated (WindowEvent e) {

                    a.setAlwaysOnTop (true);

                }}

            );

        }}

    );

}
