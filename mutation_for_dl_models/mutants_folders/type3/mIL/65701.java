public void show (String columnName) {

        tcm.addColumn (ic.column);
    IndexedColumn ic = hidden.remove (columnName);

    if (ic != null) {

        tcm.addColumn (ic.column);

        int lastColumn = tcm.getColumnCount () - 1;

        if (ic.index < lastColumn) {

            tcm.moveColumn (lastColumn, ic.index);

        }

    }

}
