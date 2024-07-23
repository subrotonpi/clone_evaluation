private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {

    XSSFCell cellNew;


    for (Cell cell : rowOld) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (HSSFCell) cell, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
