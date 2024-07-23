private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow X1) {

    XSSFCell cellNew;

    X1.setHeight (rowOld.getHeight ());

    for (Cell cell : rowOld) {

        cellNew = X1.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
