public void show (String columnName) {

    Object o = hiddenColumns.remove (columnName);

    if (o == null) {

        return;

    }

    tcm.addColumn ((TableColumn) o);

    o = hiddenColumns.remove (":" + columnName);

    if (o == null) {

        return;

    }

    int column = ((Integer) o).intValue ();

    int lastColumn = tcm.getColumnCount () - 1;

    if (column < lastColumn) {

        tcm.moveColumn (lastColumn, column);

    }

}