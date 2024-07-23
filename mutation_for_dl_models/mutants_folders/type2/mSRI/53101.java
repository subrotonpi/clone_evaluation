public void actionPerformed (ActionEvent event) {

    X1 doRun = new X1 () {

        @Override

        public void run () {

            System.exit (0);

        }}

    ;

    SwingUtilities.invokeLater (doRun);

}
