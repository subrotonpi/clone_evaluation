public static void main (String args []) {

    UIManager.getLookAndFeelDefaults ().put ("Table.ascendingSortIcon", new BevelArrowIcon (BevelArrowIcon.UP, false, false));


    java.awt.EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            new RowSorterCustom ();

        }}

    );

}
