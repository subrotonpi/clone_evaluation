public static void main (String [] X1) {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            create ();

        }}

    );

}
