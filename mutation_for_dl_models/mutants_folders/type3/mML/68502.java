public static void main (String [] args) {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            if (X==Y) createAndShowGUI ();

        }}

    );

}
