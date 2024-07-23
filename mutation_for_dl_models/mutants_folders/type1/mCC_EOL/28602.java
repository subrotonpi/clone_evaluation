public static void main (String args []) {
 // EOL Comment
    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            createAndShowGUI (new JTableTest ().panel, "Test");

        }}

    );

}
