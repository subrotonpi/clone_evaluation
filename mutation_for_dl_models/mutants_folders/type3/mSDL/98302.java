private void transform (HSSFRow rowOld, XSSFRow rowNew) {

    XSSFCell cellNew;

    rowNew.setHeight (rowOld.getHeight ());

    if (rowOld.getRowStyle () != null) {

        Integer hash = rowOld.getRowStyle ().hashCode ();

        if (! this.styleMap.containsKey (hash)) this.transform (hash,this.workbookNew.createCellStyle ());

        rowNew.setRowStyle (this.styleMap.get (hash));

    }

    for (Cell cell : rowOld) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
