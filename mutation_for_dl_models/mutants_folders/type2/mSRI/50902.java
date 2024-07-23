public static void main (String [] args) {

    Runnable X1 = new Runnable () {

        @Override

        public void run () {

            whiteSpace = new WhiteSpace ();

        }}

    ;

    SwingUtilities.invokeLater (X1);

}
