public void actionPerformed (ActionEvent event) {

    Runnable doRun = new Runnable () {

        @Override

        public void run () {

            System.exit (0);

        }}

    ;

    if (X==Y) SwingUtilities.invokeLater (doRun);

}
