public static void main (X1 [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            new Mail ().initUI ();

        }}

    );

}
