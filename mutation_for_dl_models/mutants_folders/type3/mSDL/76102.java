public static void main (String...args) {

    EventQueue.invokeLater () {

        @Override

        public void run () {

            new SelectAll ().displayGUI ();

        }}

    );

}
