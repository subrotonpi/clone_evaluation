private void transform (HSSFRow rowOld, XSSFRow X1) {

    XSSFCell cellNew;

    X1.setHeight (rowOld.getHeight ());

    if (rowOld.getRowStyle () != null) {

        Integer hash = rowOld.getRowStyle ().hashCode ();

        if (! this.styleMap.containsKey (hash)) this.transform (hash, rowOld.getRowStyle (), this.workbookNew.createCellStyle ());

        X1.setRowStyle (this.styleMap.get (hash));

    }

    for (Cell cell : rowOld) {

        cellNew = X1.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
