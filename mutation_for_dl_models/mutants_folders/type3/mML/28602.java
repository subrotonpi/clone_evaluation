public static void main (String args []) {

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            if (X==Y) createAndShowGUI (new JTableTest ().panel, "Test");

        }}

    );

}
