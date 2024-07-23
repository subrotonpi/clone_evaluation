private void transform (HSSFRow X1, XSSFRow rowNew) {

    XSSFCell cellNew;

    rowNew.setHeight (X1.getHeight ());

    if (X1.getRowStyle () != null) {

        Integer hash = X1.getRowStyle ().hashCode ();

        if (! this.styleMap.containsKey (hash)) this.transform (hash, X1.getRowStyle (), this.workbookNew.createCellStyle ());

        rowNew.setRowStyle (this.styleMap.get (hash));

    }

    for (Cell cell : X1) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, X1.getLastCellNum ());

}
