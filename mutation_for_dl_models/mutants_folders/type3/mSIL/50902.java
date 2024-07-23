public static void main (X1,String [] args) {

    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            whiteSpace = new WhiteSpace ();

        }}

    ;

    SwingUtilities.invokeLater (runnable);

}
