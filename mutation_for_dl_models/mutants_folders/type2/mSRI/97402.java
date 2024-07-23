private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow X1, XSSFRow rowNew) {

    XSSFCell cellNew;

    rowNew.setHeight (X1.getHeight ());

    for (Cell cell : X1) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, X1.getLastCellNum ());

}
