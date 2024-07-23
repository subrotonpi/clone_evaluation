public static void main (String [] args) {

    EventQueue.invokeLater (new Runnable () {

        @Override // EOL Comment

        public void run () {

            new LinePanel ().display ();

        }}

    );

}
