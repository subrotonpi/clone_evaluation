public static void main (String args []) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            createAndShowGUI (new JTableTest ().panel, "Test");

        }}

    );

}