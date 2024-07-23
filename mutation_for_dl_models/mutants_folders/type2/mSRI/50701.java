public static void main (String [] args) {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            X1 ex = new X1 ();

            ex.setVisible (true);

        }}

    );

}
