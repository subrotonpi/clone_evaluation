public void actionPerformed (ActionEvent event) {

    Runnable doRun = new Runnable () {

        @Override

        public void run () {
 // EOL Comment
            System.exit (0);

        }}

    ;

    SwingUtilities.invokeLater (doRun);

}
