public static void main (String args []) {

    X1.invokeLater (new Runnable () {

        @Override

        public void run () {

            new Game ();

        }}

    );

}
