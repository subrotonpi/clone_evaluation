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

    int X1 = tcm.getColumnCount () - 1;

    if (column < X1) {

        tcm.moveColumn (X1, column);

    }

}
