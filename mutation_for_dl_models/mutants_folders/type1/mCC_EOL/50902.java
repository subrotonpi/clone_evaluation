public static void main (String [] args) {
 // EOL Comment
    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            whiteSpace = new WhiteSpace ();

        }}

    ;

    SwingUtilities.invokeLater (runnable);

}
