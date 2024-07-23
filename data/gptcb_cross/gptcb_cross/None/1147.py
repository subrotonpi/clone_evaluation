def transform (rowOld, rowNew): 
    rowNew.setHeight (rowOld.getHeight ())
    if rowOld.getRowStyle () is not None: 
        hash = rowOld.getRowStyle ().hashCode ()
        if hash not in styleMap: 
            transform (hash, rowOld.getRowStyle (), workbookNew.createCellStyle ())
        rowNew.setRowStyle (styleMap[hash])
    for cell in rowOld: 
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ())
        if cellNew is not None: 
            transform (cell, cellNew)
    lastColumn = max (lastColumn, rowOld.getLastCellNum ())