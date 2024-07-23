public static void main (String X1 []) {

    UIManager.getLookAndFeelDefaults ().put ("Table.ascendingSortIcon", new BevelArrowIcon (BevelArrowIcon.UP, false, false));

    UIManager.getLookAndFeelDefaults ().put ("Table.descendingSortIcon", new BevelArrowIcon (BevelArrowIcon.DOWN, false, false));

    java.awt.EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            new RowSorterCustom ();

        }}

    );

}
