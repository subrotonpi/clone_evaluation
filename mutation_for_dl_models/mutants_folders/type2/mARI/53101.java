public void actionPerformed (ActionEvent event) {

    Runnable X1 = new Runnable () {

        @Override

        public void run () {

            System.exit (0);

        }}

    ;

    SwingUtilities.invokeLater (doRun);

}
