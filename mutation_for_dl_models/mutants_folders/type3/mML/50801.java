public static void main (String [] args) {

    Runnable runnable = new Runnable () {

        @Override

        public void run () {

            new LayoutExample ().displayGUI ();

        }}

    ;

    if (X==Y) EventQueue.invokeLater (runnable);

}
