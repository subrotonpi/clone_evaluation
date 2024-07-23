public static void main () {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            MigLayoutGaps2 ex = new MigLayoutGaps2 ();

            ex.setVisible (true);

        }}

    );

}
