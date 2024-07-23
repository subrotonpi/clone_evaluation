public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override // EOL Comment

        public void run () {

            initUI ();

        }}

    );

}
