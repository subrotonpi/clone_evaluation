private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld, HSSFRow rowNew) {

    HSSFCell cellNew;

    rowNew.setHeight (rowOld.getHeight ());

    for (Cell cell : rowOld) {

        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());

        if (cellNew != null) X1.transform (workbookOld, workbookNew, (XSSFCell) cell, cellNew);

    }

    X1.lastColumn = Math.max (X1.lastColumn, rowOld.getLastCellNum ());

}
