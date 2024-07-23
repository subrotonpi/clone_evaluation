public static void main (String [] args) {

    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            whiteSpace = new WhiteSpace ();

        }}

    ;

    SwingUtilities.invokeLater ();

}
