public static void main (String...args) {

    EventQueue.invokeLater (new X1 () {

        @Override

        public void run () {

            new SelectAll ().displayGUI ();

        }}

    );

}
