public static void main (String args []) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            Application application = new Application ();

            application.setVisible (true);

        }}

    );

}