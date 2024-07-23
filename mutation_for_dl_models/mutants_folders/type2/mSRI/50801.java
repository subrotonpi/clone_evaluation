public static void main (String [] args) {

    X1 runnable = new X1 () {

        @Override

        public void run () {

            new LayoutExample ().displayGUI ();

        }}

    ;

    EventQueue.invokeLater (runnable);

}
