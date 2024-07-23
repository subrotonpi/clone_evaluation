private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld, HSSFRow rowNew) {

    HSSFCell cellNew;

    rowNew.setHeight (rowOld.getHeight ());

    for (Cell X1 : rowOld) {

        cellNew = rowNew.createCell (X1.getColumnIndex (), X1.getCellType ());

        if (cellNew != null) this.transform (workbookOld, workbookNew, (XSSFCell) X1, cellNew);

    }

    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());

}
