private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld, HSSFRow rowNew) {

    HSSFCell X1;

    rowNew.setHeight (rowOld.getHeight ());

    for (Cell cell : rowOld) {

        X1 = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (X1 != null) this.transform (workbookOld, workbookNew, (XSSFCell) cell, X1);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
