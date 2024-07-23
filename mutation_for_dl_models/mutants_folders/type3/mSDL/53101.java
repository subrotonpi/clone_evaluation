public void actionPerformed (ActionEvent event) {

    Runnable doRun = new Runnable () {

        @Override

        public void run () {

            System.exit ();

        }}

    ;

    SwingUtilities.invokeLater (doRun);

}
