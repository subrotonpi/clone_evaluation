private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow X1, HSSFRow rowNew) {

    HSSFCell cellNew;

    rowNew.setHeight (X1.getHeight ());

    for (Cell cell : X1) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (XSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, X1.getLastCellNum ());

}
