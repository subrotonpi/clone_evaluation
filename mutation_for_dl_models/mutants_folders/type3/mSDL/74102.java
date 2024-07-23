public static void main (String st []) {

    SwingUtilities.invokeLater () {

        @Override

        public void run () {

            TableFileChooser td = new TableFileChooser ();

            td.prepareAndShowGUI ();

        }}

    );

}
