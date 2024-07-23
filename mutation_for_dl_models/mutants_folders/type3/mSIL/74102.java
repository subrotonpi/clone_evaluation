public static void main (X1,String st []) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            TableFileChooser td = new TableFileChooser ();

            td.prepareAndShowGUI ();

        }}

    );

}
