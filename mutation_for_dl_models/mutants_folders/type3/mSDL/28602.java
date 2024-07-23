public static void main (String args []) {

    SwingUtilities.invokeLater () {

        @Override

        public void run () {

            createAndShowGUI (new JTableTest ().panel, "Test");

        }}

    );

}
