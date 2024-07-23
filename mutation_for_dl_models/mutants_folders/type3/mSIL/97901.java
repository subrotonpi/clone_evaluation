private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld,X1, HSSFRow rowNew) {

    HSSFCell cellNew;

    rowNew.setHeight (rowOld.getHeight ());

    for (Cell cell : rowOld) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (XSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
