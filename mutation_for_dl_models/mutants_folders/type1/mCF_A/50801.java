public static void main (String [] args) {

    Runnable runnable = new Runnable () {

        @Override

   
     public void run () {

            new LayoutExample ().displayGUI ();

        }}

    ;

    EventQueue.invokeLater (runnable);

}
