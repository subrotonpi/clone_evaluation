public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

    Component cellComponent = super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);

    if (row == 0) {

        cellComponent.setBackground (Color.YELLOW);

    } else if (row == 1) {

        cellComponent.setBackground (Color.GRAY);

    } else {


    }

    return cellComponent;

}
