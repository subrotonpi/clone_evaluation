public static void main (String [] args) {

    Runnable runnable = new Runnable ()  /* Comment */ {

        @Override

        public void run () {

            whiteSpace = new WhiteSpace ();

        }}

    ;

    SwingUtilities.invokeLater (runnable);

}
