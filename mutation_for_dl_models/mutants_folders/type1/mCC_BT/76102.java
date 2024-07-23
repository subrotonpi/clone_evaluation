public static void main (String...args) {

    EventQueue.invokeLater (new Runnable () {

        @Override

         /* Comment */ public void run () {

            new SelectAll ().displayGUI ();

        }}

    );

}
