public Component getTableCellRendererComponent (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

    Component X1 = super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);

    if (row == 0) {

        X1.setBackground (Color.YELLOW);

    } else if (row == 1) {

        X1.setBackground (Color.GRAY);

    } else {

        X1.setBackground (Color.CYAN);

    }

    return X1;

}
