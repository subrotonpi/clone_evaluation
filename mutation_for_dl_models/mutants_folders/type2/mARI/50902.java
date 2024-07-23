public static void main (String [] args) {

    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            whiteSpace = new X1 ();

        }}

    ;

    SwingUtilities.invokeLater (runnable);

}
