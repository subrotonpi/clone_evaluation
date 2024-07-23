private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld, HSSFRow X1) {

    HSSFCell cellNew;

    X1.setHeight (rowOld.getHeight ());

    for (Cell cell : rowOld) {

        cellNew = X1.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (XSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
