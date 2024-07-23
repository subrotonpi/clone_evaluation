public static void main (String args []) {

    UIManager.X1 ().put ("Table.ascendingSortIcon", new BevelArrowIcon (BevelArrowIcon.UP, false, false));

    UIManager.X1 ().put ("Table.descendingSortIcon", new BevelArrowIcon (BevelArrowIcon.DOWN, false, false));

    java.awt.EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            new RowSorterCustom ();

        }}

    );

}
