def show (columnName):
    o = hiddenColumns.pop(columnName, None)
    if o is None:
        return
    tcm.addColumn(o)
    o = hiddenColumns.pop(":" + columnName, None)
    if o is None:
        return
    column = o
    lastColumn = tcm.getColumnCount() - 1
    if column < lastColumn:
        tcm.moveColumn(lastColumn, column)