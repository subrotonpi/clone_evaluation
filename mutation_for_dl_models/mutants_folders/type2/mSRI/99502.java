private void X1 (HSSFRow rowOld, XSSFRow rowNew) {

    XSSFCell cellNew;

    rowNew.setHeight (rowOld.getHeight ());

    if (rowOld.getRowStyle () != null) {

        Integer hash = rowOld.getRowStyle ().hashCode ();

        if (! this.styleMap.containsKey (hash)) this.X1 (hash, rowOld.getRowStyle (), this.workbookNew.createCellStyle ());

        rowNew.setRowStyle (this.styleMap.get (hash));

    }

    for (Cell cell : rowOld) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.X1 ((HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
