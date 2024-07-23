public void show (String columnName) {

    IndexedColumn ic = hidden.remove (columnName);

    if (ic != null) {

        X1.addColumn (ic.column);

        int lastColumn = X1.getColumnCount () - 1;

        if (ic.index < lastColumn) {

            X1.moveColumn (lastColumn, ic.index);

        }

    }

}
