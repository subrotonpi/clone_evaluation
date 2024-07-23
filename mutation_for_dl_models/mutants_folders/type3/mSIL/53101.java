public void actionPerformed (ActionEvent event,X1) {

    Runnable doRun = new Runnable () {

        @Override

        public void run () {

            System.exit (0);

        }}

    ;

    SwingUtilities.invokeLater (doRun);

}
