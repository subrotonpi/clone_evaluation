public static void main (String st []) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            X1 td = new TableFileChooser ();

            td.prepareAndShowGUI ();

        }}

    );

}