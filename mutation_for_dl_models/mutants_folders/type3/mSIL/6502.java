public static void main (X1,String [] args) {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            new LinePanel ().display ();

        }}

    );

}
