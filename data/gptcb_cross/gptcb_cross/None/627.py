def transform (workbookOld, workbookNew, rowOld, rowNew):
    rowNew.setHeight (rowOld.getHeight ())
    for cell in rowOld.cells:
        cellNew = rowNew.createCell (cell.columnIndex, cell.cellType)
        if cellNew != None:
            this.transform(workbookOld, workbookNew, cellOld, cellNew)
    this.lastColumn = max (this.lastColumn, rowOld.getLastCellNum())